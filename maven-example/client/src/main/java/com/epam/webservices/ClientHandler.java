package com.epam.webservices;

import javax.xml.namespace.*;
import javax.xml.soap.*;
import javax.xml.ws.handler.*;
import javax.xml.ws.handler.soap.*;
import java.io.*;
import java.util.*;

public class ClientHandler implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println("ClientHandler handleMessage..");

        Boolean outBoundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        //if this is a request (outgoing message), true for outbound messages, false for inbound
        if (outBoundProperty) {
            try {
                SOAPMessage message = context.getMessage();
                SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();

                //if no header that we'll add one
                if (header == null) {
                    header = envelope.addHeader();
                }

                //add password for later check on server side
                String password = "Life for Ner'Zhul";

                //add soap header name as 'password'
                QName qName = new QName("http://localhost", "password");
                SOAPHeaderElement soapHeaderElement = header.addHeaderElement(qName);

                soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
                soapHeaderElement.addTextNode(password);
                //add soap header name as 'password'
                QName qName1 = new QName("http://localhost", "userName");
                SOAPHeaderElement soapHeaderElement1 = header.addHeaderElement(qName1);

                soapHeaderElement1.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
                soapHeaderElement1.addTextNode("Sanya");
                message.saveChanges();
                //write to console for debug
                message.writeTo(System.out);

            } catch (SOAPException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //continue other handler chain
        return true;
    }

    public Set<QName> getHeaders() {
        System.out.println("ClientHandler getHeaders..");
        return null;
    }

    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("ClientHandler handleFault..");
        return false;
    }

    public void close(MessageContext context) {
        System.out.println("ClientHandler close..");
    }
}
