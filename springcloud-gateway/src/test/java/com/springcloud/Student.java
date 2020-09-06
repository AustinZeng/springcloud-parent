package com.springcloud;

/**
 * @description: 学生类
 * @author: zengcong
 * @create: 2020-06-11 14:09
 */
public class Student implements StudentInterface{

    private String name;

    private int age;

    public int getAge() {
        return age;
    }


    public void say() {
        System.out.println("我是学生");
    }

    public void say(String name,int age) {

        System.out.println("我是学生,我叫"+name+",今年"+age+"岁。");
    }

    @Override
    public <T> T get() {
        return null;
    }

    @Override
    public Object get(int a) {
        return null;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
