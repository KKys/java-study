package cglibproxy;

/**
 * cglib代理测试类
 */
public class Test {
    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        //创建代理类
        Train proxy = (Train) cglibProxy.getProxy(Train.class);
        proxy.move();
    }
}
