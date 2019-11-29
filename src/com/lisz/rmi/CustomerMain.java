package com.lisz.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CustomerMain {

	public static void main(String[] args) throws Exception {
		Registry registry = LocateRegistry.getRegistry(9999); //这里也可以指定IP + port，没有传IP则默认localhost
		SayService service = (SayService)registry.lookup("sayService");
		//像调用本地接口一样调用远程实现，这样会在客户端和服务器各打印一句“ABC, I love you”
		String str = service.say("ABC");
		System.out.println(str);
	}

}
