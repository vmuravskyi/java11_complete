package com.muravskyi.java_advanced.section10_annotations.lesson100_creating_sql_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Repository<T> {

    public void save(T t) {
        var clazz = t.getClass();
        var classAnnotations = clazz.getAnnotationsByType(Entity.class);

        var tableName = clazz.getSimpleName().toLowerCase();

        if (classAnnotations.length > 0) {
            var classAnnotation = classAnnotations[0];
            var tableNameAttribute = classAnnotation.value();

            if (tableNameAttribute.length() > 0) {
                tableName = tableNameAttribute;
            }
        }

        var fields = clazz.getDeclaredFields();

        List<String> fieldsList = new ArrayList<>();

        for (var field : fields) {
            var annotations = field.getAnnotationsByType(Field.class);

            if (annotations.length == 0) {
                continue;
            }

            var annotation = annotations[0];
            var fieldName = annotation.columnName();
            var isKey = annotation.isKey();

            if (fieldName.length() == 0) {
                fieldName = field.getName();
            }

            if (!isKey) {
                fieldsList.add(fieldName);
            }
        }

        String sqlFields = fieldsList.stream().collect(Collectors.joining(","));
        String sqlPlaceholders  = fieldsList.stream()
            .map(s -> "?")
            .collect(Collectors.joining(","));

        String sql = String.format("insert into %s (%s) values (%s)", tableName, sqlFields, sqlPlaceholders);
        System.out.println(sql);

    }

}
