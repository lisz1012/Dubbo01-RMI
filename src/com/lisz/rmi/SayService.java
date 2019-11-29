package com.lisz.rmi;

import java.rmi.Remote;

public interface SayService extends Remote {
	String say(String name) throws Exception;//这里不抛一场会有错误
}
