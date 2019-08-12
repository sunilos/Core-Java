package com.sunilos.p06oop;

/**
 * AutoMobile Class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Automobile {

	private String color = null;
	private int speed = 0;
	private int gear = 0;
	private String make = null;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getGear() {
		return gear;
	}

	public int changeGear(int g) {
		gear += g;
		return gear;
	}

}
