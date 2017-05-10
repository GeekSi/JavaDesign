package com.design.observer;

import java.util.Observable;
import java.util.Observer;

public class NoticeObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
	}

}
