package com.design.behavior.decorate.decorate;

import com.design.behavior.decorate.component.Coffee;

public class GreeTeaDecorate extends DecorateCoffe{

	public GreeTeaDecorate(Coffee coffee) {
		super(coffee);
	}

	@Override
	public float cost() {
		return super.cost() + selfCost();
	}
	
	private float selfCost(){
		return 2;
	}
	
	@Override
	public String getDescribe() {
		return super.getDescribe() + "\n\t" + "绿茶" + selfCost();
	}
}
