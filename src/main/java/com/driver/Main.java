package com.driver;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        String meth = a.meth();
        B b=new B();
        System.out.println(b.meth());
    }
}