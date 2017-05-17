package com.design.behavior.decorate.decorate;

import com.design.behavior.decorate.component.Coffee;

public class ChocolateDecorate extends DecorateCoffe{

	public ChocolateDecorate(Coffee coffee) {
		super(coffee);
	}

	@Override
	public float cost() {
		return super.cost() + selfCost();
	}
	
	private float selfCost(){
		return 5;
	}
	
	@Override
	public String getDescribe() {
		return super.getDescribe() + "\n\t" + "巧克力" + selfCost();
	}
}
