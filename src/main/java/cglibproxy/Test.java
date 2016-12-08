package cglibproxy;

/**
 * Created by Administrator on 2016/12/7.
 */
public class Test {
    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        //创建代理类
        Train proxy = (Train) cglibProxy.getProxy(Train.class);
        proxy.move();
    }
}
