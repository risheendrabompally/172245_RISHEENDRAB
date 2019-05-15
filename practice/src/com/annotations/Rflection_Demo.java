package com.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Rflection_Demo {
	
static Employee e=new Employee();
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c= Class.forName("com.annotations.Employee");
		Field[] f=c.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
	Constructor<Class>[]arr=c.getConstructors();
	for (Constructor<Class> constructor : arr) {
		System.out.println(constructor);
	}
	 Method methodcall2 = c.getDeclaredMethod("method1"); 
	 
	 methodcall2.invoke(e);
	}
}
