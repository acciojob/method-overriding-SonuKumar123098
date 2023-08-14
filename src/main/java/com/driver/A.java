package com.driver;

public class A {
    String s;
    // default constructor
    public A(){
    }
    //parametrized constructor
    public A(String s){
        this.s=s;
    }
    public String meth(){
        return this.s;
    }
}
