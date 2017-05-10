package com.design.observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherObserable extends Observable{
	private String weather = "晴";
	
	public void setWeather(String weather) {
		this.weather = weather;
		setChanged();
		notifyObservers(weather);
	}
	
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
		if (weather != null && !weather.equals("")) {
			o.update(this, weather);
		}
	}
}
