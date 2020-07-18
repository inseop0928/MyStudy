package com.mystudy.reflection;


import java.lang.annotation.*;


//anotation은 기본적으로 주석같은 개념으로 소스나 class에는 남는다. 하지만 바이트코드를 로딩했을때는 메모리상에는 남지 않는다. 그래서 리플렉션에서 조회x
//남기고 싶다면 아래와 같이 Retention을 사용해야한다.
@Retention(RetentionPolicy.RUNTIME)
//Inherited 상속
@Inherited
public @interface AnotherAnnotation {

    //defalut는 기본값 설정
    String name() default "jis";

    int number() default 100;


    //value가 없어서 파라미터 불필요
}
