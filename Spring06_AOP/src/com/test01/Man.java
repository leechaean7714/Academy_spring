package com.test01;

public class Man {

	public void classWork() {
		
		System.out.println("출석 카드를 찍는다.");

		try {
			System.out.println("컴을 키고 게임을 한다.");

		} catch (Exception e) {

			System.out.println("쉬는 날이었다.");
		} finally {
			System.out.println("집에 간다.");
		}
	}

}
