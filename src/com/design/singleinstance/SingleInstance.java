package com.design.singleinstance;

/**
 * 饿汉模式
 * @author siqing
 *
 */
public class SingleInstance {
	private static SingleInstance _iInstance = new SingleInstance();
	
	private SingleInstance(){
		
	}

	public SingleInstance getInstance(){
		return _iInstance;
	}
}
