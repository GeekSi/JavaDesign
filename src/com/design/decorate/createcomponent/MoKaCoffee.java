package com.design.decorate.createcomponent;

import com.design.decorate.component.Coffee;

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
