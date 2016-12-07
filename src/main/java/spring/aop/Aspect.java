package spring.aop;

/**
 * aop切面类
 */
public class Aspect {
    //方法执行前执行此方法
    public void before(){
        System.out.println("before aspect...");
    }

    //方法执行返回后执行此方法，有异常则不会执行
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    //方法结束后，执行 有异常也会执行
    public void after(){
        System.out.println("after...");
    }

    //抛出异常时执行此方法
    public void afterThrowing(){
        System.out.println("Here is a Exception!!");
    }
}
