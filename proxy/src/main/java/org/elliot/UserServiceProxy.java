package org.elliot;

public class UserServiceProxy implements ProxyInterface{

    private ProxyInterface proxyInterface;

    public UserServiceProxy(ProxyInterface proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("被代理了");
        proxyInterface.login(username,password);
    }
}
