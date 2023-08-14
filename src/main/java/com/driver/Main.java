package com.driver;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        String meth = b.meth();
        System.out.println(meth);
//        B b=new B();
        System.out.println(b.meth());
    }
}