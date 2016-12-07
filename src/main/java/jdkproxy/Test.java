package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * jdk动态代理测试
 */
public class Test {

    public static void main(String[] args){
        Car car = new Car();
        //创建处理器，传入处理对象
        InvocationHandler h = new TimeHandler(car);
        //获取car的字节码
        Class<?> aClass= car.getClass();
        /**
         *  参数：类加载器，car实现的接口，处理器
            生成了代理对象
         */
        Move proxy = (Move) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),h);
        proxy.move();
        proxy.stop();
    }
}
