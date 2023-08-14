package com.driver;

public class B extends A {
   String name="kallu";

    public B() {
    }

    public B(String s) {
        this.name=s;
    }

    public String meth(){
        return this.name;
    }
}
