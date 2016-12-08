package jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 对时间的处理
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    //构造函数构造处理对象
    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     * 对时间处理的方法
     * @param proxy 代理对象,是动态生成的，不是被代理对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return 被代理对象方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使");
        method.invoke(target);
        System.out.println("汽车形式结束，行驶时间："+(System.currentTimeMillis()-startTime)+"毫秒");
        return null;
    }

}
