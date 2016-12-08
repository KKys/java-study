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
            生成了代理对象proxy
         */
        Move proxy = (Move) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),h);
        //接口中的方法交由代理对象去执行，其实是执行的处理器中的invoke方法,只不过是把Move接口中的move方法传递给处理器罢了
        proxy.move();
        proxy.stop();
    }
}
