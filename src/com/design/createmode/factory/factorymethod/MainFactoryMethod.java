package com.design.createmode.factory.factorymethod;

public class MainFactoryMethod {

	
	public static void main(String[] args) {
		IFactory factory = new Factory();
		IProduct product = factory.createProduct();
		product.desc();
	}
}
