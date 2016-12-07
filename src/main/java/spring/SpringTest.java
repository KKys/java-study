package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aop.AspectImpl;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SpringTest {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");//spring.xml中的内容
//        SpringBean p = (SpringBean)ctx.getBean("springBean");//创建bean的引用对象
//        p.info();
        AspectImpl as = (AspectImpl)ctx.getBean("aspectImpl");
        as.aspectImplOne();
//        as.aspectImplTwo();
    }
}
