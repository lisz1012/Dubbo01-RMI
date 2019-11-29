package com.lisz.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServicceMain {

	public static void main(String[] args) throws Exception {
		//实例化要暴露给远程的类或者方法/接口
		SayService service = new SayServiceImpl();
		//开启本地服务，到处本地接口
		SayService serviceToBePublished = (SayService)UnicastRemoteObject.exportObject(service, 8888);
		//服务注册中心
		Registry registry = LocateRegistry.createRegistry(9999);
		//注册服务
		registry.rebind("sayService", serviceToBePublished);
	}

}
