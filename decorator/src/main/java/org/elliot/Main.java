package org.elliot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //注意这里的new TakePhotoCamera() 意味着可以在运行时指定注入的bean
        BeautyCameraDecorator beautyCameraDecorator = new BeautyCameraDecorator(new TakePhotoCamera());
        beautyCameraDecorator.operation();
    }
}