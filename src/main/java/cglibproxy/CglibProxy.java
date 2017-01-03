package cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/12/7.
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer= new Enhancer();

    //产生代理对象，参数是被代理类
    public Object getProxy(Class clazz){
        //为哪个类产生代理类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * @param obj 目标类的实例，也就是被代理类
     * @param method 目标方法的反射对象
     * @param args 方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("日志开始");
        //代理类调用父类方法
        methodProxy.invokeSuper(obj,args);
        System.out.println("日志结束");
        return null;
    }
}
