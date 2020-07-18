package com.mystudy.reflection;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {

    public static void main(String[] args){
        //로딩시 class타입은 인스턴스를 만들어 heao에다가 저장하기 때문에 바로 접근이 가능

        Class<Book> bookClass = Book.class;
        Book book = new Book();

        //인스턴스를 통할때는 . 클래스
        Class<? extends Book> aClass = book.getClass();

        //classForName 문자열(풀경로 문자열)만 가지고 클래스를 구할수 있다
        try {
            Class<?> aclass = Class.forName("coom.mystudy.reflection.Book");
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        }


        //getFields 접근제어자 public만 가져온다
        Arrays.stream(aClass.getFields()).forEach(System.out::println);

        System.out.println();

        //getDeclaredFields 모든 접근제어자를 가져온다.
        Arrays.stream(aClass.getDeclaredFields()).forEach(System.out::println);

        System.out.println();


        //필드값 불러오기
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f->{

            try {
                f.setAccessible(true);//접근가능
                System.out.printf("%s %s\n",f,f.get(book));//값을 가져오고 싶을때는 인스턴스 필요(book 입력이유)

                int modifier = f.getModifiers();
                System.out.println(Modifier.isPrivate(modifier));//접근제어자 유형

                //modifier를 사용하면 유형 파라미터,리턴등 다양한 유형 확인가능
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        //컨스트럭터는 생성자 불러옴
        Arrays.stream(MyBook.class.getDeclaredConstructors()).forEach(System.out::println);
     }
}
