package com.emix.quartz;

import java.io.Serializable;
import java.util.Date;

/**
 * @author niko
 */
public class HelloWorld implements Serializable {

    private static final long serialVersionUID = 1L;

    public void sayHello() {
        System.out.println("Hello World : " + new Date());
    }

}
