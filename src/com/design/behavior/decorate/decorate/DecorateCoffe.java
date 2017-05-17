package com.design.behavior.decorate.decorate;

import com.design.behavior.decorate.component.Coffee;

public class DecorateCoffe implements Coffee{
	private Coffee coffee;
	
	public DecorateCoffe(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public float cost() {
		return coffee.cost();
	}

	@Override
	public String getDescribe() {
		return coffee.getDescribe();
	}

}
