package com.muravskyi.java_advanced.section10_annotations.lesson99_class_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Field {

    String columnName() default "";
    boolean isKey() default false;

}
