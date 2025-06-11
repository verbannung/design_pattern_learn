package org.elliot;

public class TakePhotoCamera implements Camera{
    @Override
    public void operation() {
        System.out.println("我是原来的方法");
    }
}
