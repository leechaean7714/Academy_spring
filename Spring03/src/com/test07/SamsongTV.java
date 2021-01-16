package com.test07;

public class SamsongTV implements TV{
	
 public SamsongTV() {
	 
		System.out.println("samsongtv 생성");
 }
//ig tv power on
	@Override
	public void powerON() {
		
		System.out.println("samsong tv power on");
	}

	@Override
	public void powerOff() {
		
		System.out.println("samsong tv power off");
	}

	@Override
	public void volumeUp() {
		
		System.out.println("samsong tv power on");
	}

	@Override
	public void volumeDowm() {
		
		System.out.println("samsong tv power on");
	}
	
	

}
