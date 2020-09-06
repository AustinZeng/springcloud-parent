package com.springcloud;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-11 11:30
 */
public class JDKProxy implements InvocationHandler {

    private Object target;//需要代理的目标对象

    public JDKProxy(Object target){
        this.target = target;
    }

    /*public Object createProxy() {//将目标对象传入进行代理

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);//返回代理对象
    }*/

    public <T> T createProxy() {//将目标对象传入进行代理

        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);//返回代理对象
    }

    public Object invoke(Object proxy, Method method, Object[] args)//invoke方法
            throws Throwable {
        before();
       // 设置方法的返回
         Object ret  = method.invoke(target, args);       //invoke调用需要代理的方法
        after();
        return ret;
    }

    private void before() {//方法执行前
        System.out.println("方法执行前 !");
    }
    private void after() {//方法执行后
        System.out.println("方法执行后");
    }
}
