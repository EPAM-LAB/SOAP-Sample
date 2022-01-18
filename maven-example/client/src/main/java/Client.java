import com.epam.webservices.impl.*;

import java.net.*;


public class Client {
    public static void main(String[] args) throws MalformedURLException {
        HelloServiceImplService helloService = new HelloServiceImplService();
        HelloService helloServiceImplPort = helloService.getHelloServiceImplPort();
        System.out.println("num is " + helloServiceImplPort.getNum(1));

    }
}
