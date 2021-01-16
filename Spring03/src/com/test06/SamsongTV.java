package com.test06;

public class SamsongTV implements TV{
//ig tv power on
	
	
	@Override
	public void powerOn() {
		
		System.out.println("samsong tv power on");
	}

	@Override
	public void powerOff() {
	
		System.out.println("samsong tv power off");
	}

	@Override
	public void volumeUp() {
	
		System.out.println("samsong tv volume on");
	}

	@Override
	public void volumeDowm() {
	
		System.out.println("samsong tv volume off");
	}
	
	

}
