package org.elliot;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib代理，方法执行前: " + method.getName());
        // 调用原始方法
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("cglib代理，方法执行后: " + method.getName());
        return result;
    }
}
