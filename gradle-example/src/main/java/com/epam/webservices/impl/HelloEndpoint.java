package com.epam.webservices.impl;


import com.epam.webservices.*;

import jakarta.jws.*;


@WebService(endpointInterface = "com.epam.webservices.HelloService")
public class HelloEndpoint implements HelloService {

    public String getSimple() {
        return "OK";
    }


    public String getNum(int num) {
        return "Your num is " + num;
    }

}
