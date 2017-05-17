package com.design.behavior.decorate.createcomponent;

import com.design.behavior.decorate.component.Coffee;

public class KabucoCoffee implements Coffee{

	@Override
	public float cost() {
		return 24;
	}

	@Override
	public String getDescribe() {
		return "卡布奇诺:" + cost();
	}

}
