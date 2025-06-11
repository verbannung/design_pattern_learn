package org.elliot;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//静态代理
//        ProxyInterface proxyInterface=new UserServiceImpl();
//        UserServiceProxy userServiceProxy = new UserServiceProxy(proxyInterface);
//        userServiceProxy.login("你好", "123456");


        //jdk动态代理
//        ProxyInterface userService = new UserServiceImpl();
//        JDKProxy jdkProxy = new JDKProxy(userService);
//        ProxyInterface proxy = (ProxyInterface) Proxy.newProxyInstance(
//                userService.getClass().getClassLoader(),
//                userService.getClass().getInterfaces(),
//                jdkProxy);
//
//        proxy.login("elliot", "elliot");


        //cglib动态代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new CglibProxy());

        // 创建代理对象
        UserService proxy = (UserService) enhancer.create();
        proxy.login("elliot", "elliot");
    }
}