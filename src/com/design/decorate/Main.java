package com.design.decorate;

import com.design.decorate.component.Coffee;
import com.design.decorate.createcomponent.KabucoCoffee;
import com.design.decorate.decorate.ChocolateDecorate;
import com.design.decorate.decorate.MilkDecorate;

public class Main {

	public static void main(String[] args) {
		Coffee coffee = new KabucoCoffee();
		coffee = new MilkDecorate(coffee);
		coffee = new ChocolateDecorate(coffee);
		coffee = new ChocolateDecorate(coffee);
		System.out.println("共花费："+coffee.cost());
		System.out.println("订单详情：\n\t"+coffee.getDescribe());
	}
	
}
