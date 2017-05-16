package com.design.createmode.factory.factorymethod;

public class Factory implements IFactory{

	@Override
	public IProduct createProduct() {
		return new Product();
	}

}
