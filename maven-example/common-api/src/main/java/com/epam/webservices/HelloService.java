package com.epam.webservices;

import javax.jws.*;
import javax.jws.soap.*;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloService {

    @WebMethod
    String getSimple();

    @WebMethod
    String getNum(@WebParam(name = "num") int num);
}
