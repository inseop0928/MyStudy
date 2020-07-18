package com.mystudy.reflection;


@MyAnnotation(name ="인섭",number =10,value="카카")
public class Book {

    private static  String B = "BookB";

    private static  String C = "BookC";

    private String a = "a";

    public String d = "d";

    protected String e = "e";

    public Book(){

    }

    @AnotherAnnotation
    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f(){
        System.out.println("f");
    }

    public  void g(){
        System.out.println("g");
    }

    public Integer h(){
        return 11;
    }
}
