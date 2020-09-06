package com.springcloud;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-11 09:36
 */
public class Mytest {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        MinStudent ms = new MinStudent();
        ms.setSex(1);
        list.add(ms);
        MinStudent ms1 = (MinStudent)list.get(0);
        System.out.println(ms1.getSex());

/*        MinStudent m = new MinStudent();
        m.setAge(100);
        System.out.println(m.getAge());*/

    /*    Student s = new MinStudent();
        s.say();
        MinStudent m = (MinStudent)s;
         m.say();*/

       /* if(s instanceof MinStudent){
            System.out.println("f1是Zi的类型");
        }
        else{
            System.out.println("f1是Son的类型");
        }*/

        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

    /*    StudentInterface s=new StudentIMmpl();

        StudentInterface proxy =  new JDKProxy(s).createProxy();
        proxy.say();

        StudentInterface proxy1 = (StudentInterface) new CglibProxy().createProxy(StudentIMmpl.class);
        proxy1.say();*/
    }
}
