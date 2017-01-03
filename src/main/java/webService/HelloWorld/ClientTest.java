package webService.HelloWorld;


import webService.HelloWorld.wsdl.ServerService;
import webService.HelloWorld.wsdl.Server;
/**
 * Created by Administrator on 2017/1/3.
 */
public class ClientTest {

    public static void main(String[] args){
        //获取服务端的服务
        ServerService service = new ServerService();
        //获取服务端的代理
        Server serverProxy = service.getServerPort();
        //代理类执行服务端的方法
        String response = serverProxy.hello("KKys");
        System.out.println(response);
    }




}
