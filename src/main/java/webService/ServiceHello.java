package webService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * WebService服务端
 */

@WebService
public class ServiceHello {

    /**
     * 供客户端调用的方法
     */
    public String getValue(String name){
        return "WebService您好，我叫"+name;
    }

    /**
     * 发布服务端
     */
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9001/Service/ServiceHello",new ServiceHello());
        System.out.println("service success");
    }
}
