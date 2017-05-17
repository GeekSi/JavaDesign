package com.design.behavior.decorate;

import com.design.behavior.decorate.component.Coffee;
import com.design.behavior.decorate.createcomponent.KabucoCoffee;
import com.design.behavior.decorate.decorate.ChocolateDecorate;
import com.design.behavior.decorate.decorate.MilkDecorate;

/**
 * @author siqing
 *
 */
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
