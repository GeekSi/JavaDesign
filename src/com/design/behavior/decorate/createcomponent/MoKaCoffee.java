package com.design.behavior.decorate.createcomponent;

import com.design.behavior.decorate.component.Coffee;

public class MoKaCoffee implements Coffee{

	@Override
	public float cost() {
		return 18;
	}

	@Override
	public String getDescribe() {
		return "摩卡" + cost();
	}

}
