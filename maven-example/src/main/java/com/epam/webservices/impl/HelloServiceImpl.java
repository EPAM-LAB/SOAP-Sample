package com.epam.webservices.impl;

import javax.jws.*;

@WebService(endpointInterface = "com.epam.webservices.HelloService")
public class HelloServiceImpl {

    @WebMethod(operationName = "getSimple")
    public String getSimple() {
        return "OK";
    }

    @WebMethod(operationName = "getNum")
    public String getNum(@WebParam(name = "num") int num) {
        return "Your num is " + num;
    }

}
