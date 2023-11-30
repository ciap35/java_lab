package com.demo.java.lab.practices.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Annotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Stella");
        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("It has @VeryImportant annotation declared in it");
        }

        for(Field field : myCat.getClass().getDeclaredFields()){
         if(field.isAnnotationPresent(Required.class)){
             System.out.println("It has @Required annotation declared in it");
             System.out.println("It has @Required annotation declared in it");
             System.out.println("Field:" +field.getName());
             System.out.println("Type:" +field.getType());
             Object objectValue =  field.get(myCat);
             /*NOT SUPPORTED ON JAVA 11*/
             /*if(objectValue instanceof String stringValue){
                 System.out.println("String value:" +stringValue);
             }*/
         }
        }

        for(Method method : myCat.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for(int i=0;i<annotation.times();i++){
                    method.invoke(myCat);
                }
            }
        }
    }
}
