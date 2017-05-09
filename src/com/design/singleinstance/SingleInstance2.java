package com.design.singleinstance;

public class SingleInstance2 {
	private static SingleInstance2 _instance;

	private SingleInstance2() {

	}

	public static SingleInstance2 getInstance() {
		if (_instance == null) {
			synchronized (SingleInstance2.class) {
				if (_instance == null) {
					_instance = new SingleInstance2();
				}
			}
		}
		return _instance;
	}

}
