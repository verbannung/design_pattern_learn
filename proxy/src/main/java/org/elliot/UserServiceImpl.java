package org.elliot;

public class UserServiceImpl implements UserService {

    @Override
    public void login(String username, String password) {
        System.out.println("用户登录成功");
    }

    @Override
    public void otherOperation() {
        return;
    }
}
