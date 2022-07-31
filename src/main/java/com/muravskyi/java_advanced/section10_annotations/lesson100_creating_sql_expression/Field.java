package com.muravskyi.java_advanced.section10_annotations.lesson100_creating_sql_expression;

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
