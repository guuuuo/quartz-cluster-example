package com.telek.quartz;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:具体业务代码，此处为简单的输出:HelloWorld+打印时间
 * HelloWorld.java Create on 2012-11-23 上午9:33:55 
 * @author 张景
 * @version 1.0
 * Copyright (c) 2012 telek. All Rights Reserved.
 */
public class HelloWorld implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void sayHello(){
		System.out.println("Hello World : " + new Date());
	}

}
