package webService.HelloWorld;

import webService.ServiceHello;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * WebService服务端
 */

@WebService
public class Server {

    /**
     * 供客户端调用的方法
     */
    public String hello(String name){
        return "Hello WebService，I'm "+name;
    }

    /**
     * 发布服务端，然后生成wsdl文件
     */
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9001/HelloWorld",new Server());
        System.out.println("service success");
    }

}
