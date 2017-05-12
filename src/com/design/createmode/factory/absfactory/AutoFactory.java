package com.design.createmode.factory.absfactory;

public class AutoFactory implements AbsFactory{

	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	@Override
	public Wheel createWheel() {
		return new WheelA();
	}

}
