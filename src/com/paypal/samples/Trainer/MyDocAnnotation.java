package com.paypal.samples.Trainer;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface MyDocAnnotation {
	String author();
	String pubdate();
	int version() default 1;
	String[] reviewers();

}
