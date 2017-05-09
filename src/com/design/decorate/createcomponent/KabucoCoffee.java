package com.design.decorate.createcomponent;

import com.design.decorate.component.Coffee;

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
