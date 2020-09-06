package com.springcloud;

/**
 * @description: 学生类
 * @author: zengcong
 * @create: 2020-06-11 09:37
 */
public class StudentIMmpl implements StudentInterface{


    @Override
    public void say() {
        System.out.println("说什么都行");
    }

    @Override
    public <T> T get() {
       if(true) {
           Student s = new Student();
           s.setName("菊花");
           return (T) s;
       }else {
           String a ="菊花";
           return (T) a;
       }
    }

    @Override
    public Object get(int a) {
        return null;
    }


}
