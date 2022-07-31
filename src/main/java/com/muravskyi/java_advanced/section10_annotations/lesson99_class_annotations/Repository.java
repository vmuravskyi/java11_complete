package com.muravskyi.java_advanced.section10_annotations.lesson99_class_annotations;

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
        System.out.println(tableName);

        var fields = clazz.getDeclaredFields();

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

            System.out.println(fieldName + " : " + isKey);
        }

    }

}
