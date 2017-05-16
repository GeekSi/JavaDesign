package com.design.behavior.strategy;

public class MainStrategy {

	public static void main(String[] args) {
		Context context = new Context(new StrategyA());
		context.excute();
		context = new Context(new StrategyB());
		context.excute();
	}
}
