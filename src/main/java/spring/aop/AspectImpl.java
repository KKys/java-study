package spring.aop;

/**
 * aop切面实现类
 */
public class AspectImpl {
    //测试切面 前置后置通知
    public void aspectImplOne(){
        System.out.println("aspectImplOne...");
    }

    //测试切面 抛出异常的通知
    public void aspectImplTwo(){
        System.out.println("aspectImplTwo...");
        throw new RuntimeException();
    }
}
