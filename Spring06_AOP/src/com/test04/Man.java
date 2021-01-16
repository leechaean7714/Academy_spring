package com.test04;

public class Man implements Person {

	@Override
	public String classWork() {
		
		
		//이거 지우고 해보기
		//String s =null;
		//s.length();//nullpointer 뜨고 쉬는 날이었따.(예외 발생 )
		
		System.out.println("컴키고 게임한다.");
		
		return "게임";
	}

}
