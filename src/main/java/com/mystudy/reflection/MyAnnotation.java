package com.mystudy.reflection;


import java.lang.annotation.*;


//anotation은 기본적으로 주석같은 개념으로 소스나 class에는 남는다. 하지만 바이트코드를 로딩했을때는 메모리상에는 남지 않는다. 그래서 리플렉션에서 조회x
//남기고 싶다면 아래와 같이 Retention을 사용해야한다.
@Retention(RetentionPolicy.RUNTIME)
//Target 사용할수 있는 위치를 제한
@Target({ElementType.FIELD,ElementType.TYPE})
//Inherited 상속
@Inherited
public @interface MyAnnotation {

    //defalut는 기본값 설정
    String name() default "jis";

    int number() default 100;

    //명칭이 value이면 사용처에서 따로 명시할 필요는 없다, 단 여러개 속성 지정시 반드시 이름 필요

    String value();
}
