package com.epam.webservices.impl;

import com.epam.webservices.*;

import javax.jws.*;

@WebService(endpointInterface = "com.epam.webservices.HelloService")
@HandlerChain(file = "handler-chain.xml")
public class HelloServiceImpl implements HelloService {

    @WebMethod(operationName = "getSimple")
    public String getSimple() {
        return "OK";
    }

    @WebMethod(operationName = "getNum")
    public String getNum(@WebParam(name = "num") int num) {
        return "Your num is " + num;
    }

    @WebMethod(operationName = "saveUser")
    public User saveUser(@WebParam(name = "user") User user) {
        return user;
    }

}
