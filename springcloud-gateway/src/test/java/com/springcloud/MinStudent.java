package com.springcloud;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-11 14:10
 */
public class MinStudent extends Student{


    private int sex;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public void say() {
        System.out.println("我是小学生");
    }
}
