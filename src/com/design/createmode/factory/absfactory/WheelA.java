package com.design.createmode.factory.absfactory;

public class WheelA implements Wheel{

	@Override
	public void createWheel() {
		System.out.println("创建车轮A");
	}

}
