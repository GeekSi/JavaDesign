package com.design.behavior.observer;

public class ObserverTest {
	
	
	public static void main(String[] args) {
		WeatherObserable obserable = new WeatherObserable();
		NoticeObserver noticeObserver = new NoticeObserver();
		obserable.addObserver(noticeObserver);
		obserable.setWeather("晴转多云");
	}
}
