package com.design.decorate.decorate;

import com.design.decorate.component.Coffee;

public class MilkDecorate extends DecorateCoffe{

	public MilkDecorate(Coffee coffee) {
		super(coffee);
	}

	@Override
	public float cost() {
		return super.cost() + selfCost();
	}
	
	private float selfCost(){
		return 1;
	}
	
	@Override
	public String getDescribe() {
		return super.getDescribe() + "\n\t" + "牛奶" + selfCost();
	}
}
