package com.design.createmode.factory.absfactory;

public class BMWFactory implements AbsFactory{

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public Wheel createWheel() {
		return new WheelB();
	}

}
