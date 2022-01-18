package com.epam.webservices.impl;


import javax.xml.namespace.*;
import javax.xml.soap.*;
import javax.xml.ws.handler.*;
import javax.xml.ws.handler.soap.*;
import java.io.*;
import java.util.*;

public class Handler implements SOAPHandler<SOAPMessageContext>{
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        SOAPMessage message = context.getMessage();
        try {
            message.getSOAPHeader().examineAllHeaderElements().forEachRemaining(e ->
                    System.out.println( ((SOAPHeaderElement) e).getValue()));
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            message.writeTo(System.out);
        } catch (SOAPException | IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
