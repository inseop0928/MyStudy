package com.mystudy.reflection;

import java.util.Arrays;

public class App1 {

    public static void main(String[] args){
       Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);

       //특정어노테이션에 정보 검색
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f->{
            Arrays.stream(f.getAnnotations()).forEach(a->{
                if(a instanceof MyAnnotation){
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println(myAnnotation.name());
                    System.out.println(myAnnotation.value());
                    System.out.println(myAnnotation.number());
                }
            });
        });


    }
}
