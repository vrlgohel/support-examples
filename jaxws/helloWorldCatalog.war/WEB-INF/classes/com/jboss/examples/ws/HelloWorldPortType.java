/*
 * To the extent possible under law, Red Hat, Inc. has dedicated all copyright
 * to this software to the public domain worldwide, pursuant to the CC0 Public
 * Domain Dedication. This software is distributed without any warranty.  
 * See <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package com.jboss.examples.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.6-patch-01
 * Thu Jun 23 10:59:01 CDT 2011
 * Generated source version: 2.2.6-patch-01
 * 
 */
 
@WebService(targetNamespace = "http://ws.examples.jboss.com/", name = "HelloWorldPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorldPortType {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws.examples.jboss.com/", className = "com.jboss.examples.ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws.examples.jboss.com/", className = "com.jboss.examples.ws.HelloResponse")
    @WebMethod
    public com.jboss.examples.ws.HelloReturn hello(
        @WebParam(name = "arg0", targetNamespace = "")
        com.jboss.examples.ws.HelloInput arg0
    );
}
