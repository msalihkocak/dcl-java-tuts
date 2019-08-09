package com.example.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Random {

	int min() default 1;

	int max() default 49;

	int size() default 6;

	boolean distinct() default true;

	boolean sorted() default true;

}
