package com.lisz.rmi;

public class SayServiceImpl implements SayService {

	@Override
	public String say(String name) {
		String str = name + ", I love you";
		System.out.println(str);
		return str;
	}

}
