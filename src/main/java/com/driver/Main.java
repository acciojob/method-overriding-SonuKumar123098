package com.driver;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        String meth = a.meth();
        System.out.println(meth);
        B b=new B();
        System.out.println(b.meth());
    }
}