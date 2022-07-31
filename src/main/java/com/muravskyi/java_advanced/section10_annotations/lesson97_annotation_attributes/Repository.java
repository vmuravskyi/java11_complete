package com.muravskyi.java_advanced.section10_annotations.lesson97_annotation_attributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Repository<T> {

    public void save(T t) {
        var clazz = t.getClass();
//        var fields = clazz.getDeclaredFields();
//
//        for (var field : fields) {
//            var annotation = field.getAnnotationsByType(Field.class);
//
//            if (annotation.length > 0) {
//                System.out.println(field);
//            }
//        }

        var fieldList = Arrays.stream(clazz.getDeclaredFields())
            .filter(field -> field.getAnnotationsByType(Field.class).length > 0)
            .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(fieldList);
    }

}
