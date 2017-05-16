package com.design.createmode.factory.absfactory;

public class MainAbsFactory {

	public static void main(String[] args) {
		BMWFactory factory = new BMWFactory();
		factory.createEngine().createEngine();
		factory.createWheel().createWheel();
		
		AutoFactory autoFactory = new AutoFactory();
		autoFactory.createEngine().createEngine();
		autoFactory.createWheel().createWheel();
	}
}
