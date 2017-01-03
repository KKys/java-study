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
        InvocationHandler handler = new TimeHandler(car);
        //获取car的字节码
        Class<?> aClass= car.getClass();
        /**
         *  参数：类加载器，car实现的接口，处理器
            生成了代理对象proxy
         */
        Move proxy = (Move) Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),handler);
        //接口中的方法交由代理对象去执行，其实是执行的处理器中的invoke方法,只不过是把Move接口中的move方法传递给处理器罢了
        proxy.move();
        proxy.stop();

        /**
         * 动态代理实现思路：
         * 实现功能：通过 Proxy的newProxyInstance方法返回代理对象
         * 1.声明一段源码（动态产生代理）
         * 2.编译源码（JDK Compiler API），产生新的类（代理类）
         * 3.将这个类load到内存中，产生一个新的对象（代理对象）
         * 4.return 代理对象
         */
    }
}
