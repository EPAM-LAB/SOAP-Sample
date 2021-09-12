package com.epam.webservices;


import jakarta.jws.*;
import jakarta.jws.soap.*;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloService {

    @WebMethod
    String getSimple();

    @WebMethod
    String getNum(int num);
}
