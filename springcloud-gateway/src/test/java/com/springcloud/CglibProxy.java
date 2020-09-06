package com.springcloud;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-11 14:27
 */
public class CglibProxy implements MethodInterceptor {

    // 根据一个类型产生代理类，此方法不要求一定放在MethodInterceptor中
    public Object createProxy(Class<?> clazz)
    {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 这里增强
        System.out.println("方法执行前 !");

        Object target=  methodProxy.invokeSuper(o, objects);

        System.out.println("方法执行后 !");

        return target;
    }
}
