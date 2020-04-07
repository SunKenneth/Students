package com.xxsun;

public class Student {



    String name;
    int  english;
    int  math;

    public Student(String name, int english, int math) {

        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(name+"\t"+math+"\t"+ english +"\t");
    }
}
