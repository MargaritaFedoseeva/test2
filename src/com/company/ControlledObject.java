package com.company;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value ={ ElementType.TYPE,ElementType.FIELD})//для описания типов и полей
public @interface ControlledObject {
    String name();
    int def() default 22;
}
