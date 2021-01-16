package com.test03;

import org.springframework.stereotype.Component;

@Component
public class IgTV implements TV{
	
	public IgTV() {
		
		System.out.println("igtv생성");
	}
	

	@Override
	public void powerON() {
		System.out.println("ig tv power on");
		
	}

	@Override
	public void powerOff() {
	
		System.out.println("ig tv power off");
	}

	@Override
	public void volumeUp() {
	
		System.out.println("ig tv volume up");
	}

	@Override
	public void volumeDowm() {
		
		System.out.println("ig tv volume down");
	}

}
