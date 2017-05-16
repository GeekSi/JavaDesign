package com.design.createmode.factory.absfactory;

public class EngineA implements Engine{

	@Override
	public void createEngine() {
		System.out.println("创建发动机A");
	}

}
