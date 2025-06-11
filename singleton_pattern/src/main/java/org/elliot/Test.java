package org.elliot;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class Test implements Cloneable, Serializable {
    
    private static volatile boolean isCreated=false;

    private String name;
    private String age;
    
    // 防止反射攻击
    public Test() {
        if (isCreated) {
            throw new RuntimeException("不允许创建多个实例！");
        }else {
            isCreated=true;
        }
    }

    // 防止克隆破坏
    @Override
    public Object clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException("单例不支持克隆");
        return EagerInitialization.getInstance();
    }
    
    // 防止序列化破坏
    @Serial
    private Object readResolve() {
        //例子
        return EagerInitialization.getInstance();
    }
}
