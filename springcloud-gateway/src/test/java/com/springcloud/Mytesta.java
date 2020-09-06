package com.springcloud;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-11 15:44
 */
public class Mytesta {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> classBook = Class.forName("com.springcloud.Student");

          Student s = (Student) classBook.newInstance();

        /**
         * s.say();
         **/

        Method m = classBook.getDeclaredMethod("say",String.class,int.class);

        m.invoke(s,"菊明",18);
    }
}
