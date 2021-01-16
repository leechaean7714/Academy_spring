package com.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //myNickPrn bean 생성
public class MyNickPrn {
	
	@Autowired  //Nickname타입의 객체를 찾아서 값을 넣어준다.
	private Nickname nickname;
    
	public Nickname getNickname() {
		return nickname;
	}

	public void setNickname(Nickname nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		
		return "내별명은" + nickname + "입니다.";
	}
	
	

}
