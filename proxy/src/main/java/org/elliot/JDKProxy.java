package org.elliot;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler {
    private final Object target; // 被代理的目标对象

    public JDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前: " + method.getName());
        // 调用目标对象的方法
        Object result = method.invoke(target, args);
        System.out.println("方法执行后: " + method.getName());
        return result;
    }
}
