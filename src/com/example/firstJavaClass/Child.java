package com.example.firstJavaClass;

public class Child extends Parent {
    void eat(){System.out.println("babydog is eating...");}
    double price = 15;
    public static void main(String args[]){
        Parent a=new Parent();//Parent, data member and method
        System.out.println(a.price);
        a.eat();
        Parent b=new Child();//data member :Parent; method:Child
        System.out.println(b.price);
        b.eat();
        b.laugh();
        Child c=new Child();//data member: Child, method:Child
        System.out.println(c.price);
        c.eat();

        Child d= (Child) new Parent();//Child, data member;Child method
        System.out.println(d.price);
        d.eat();
        
    }}