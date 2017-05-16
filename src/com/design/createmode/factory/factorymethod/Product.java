package com.design.createmode.factory.factorymethod;

public class Product implements IProduct{

	@Override
	public void desc() {
		System.out.println("创建了一个产品");
	}

}
