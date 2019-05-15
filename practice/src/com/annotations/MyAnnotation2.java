package com.annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Person {
    String name();
    int age();
}
public class MyAnnotation2 {
	
	@Person(name = "Jamie", age=21)
    public void getPerson() {
    }
	
}
