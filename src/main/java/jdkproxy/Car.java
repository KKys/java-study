package jdkproxy;

/**
 * Created by Administrator on 2016/12/7.
 */
public class Car implements Move {

    @Override
    public void move() {
        System.out.println("汽车行驶中");
    }

    @Override
    public void stop() {
        System.out.println("汽车停止中");
    }
}
