package com.test02;

import java.util.Locale;

/*
 * MessageSourceAware 는 번들이 지정된 properties 파일을 setMessageSource로 전달한다.
 * ->메시지 국제화를 위해 사용
 * 
 * ResouceBundleMessageSouce와 MessageSourceAware는 싸으로 사용한다.
 * ResouceBundleMessageSouce의 setBaseName()을 통해 전달받은 파일을
 * SetmessageSource()를 자동 호출해서 매핑하는 역할을 한다.
 */

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MemberInfo implements MessageSourceAware {

	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {//여기로 전달

		System.out.println("컨테이너가 메시지 설정을 수행중");
		this.messageSource = messageSource;
	}

	public void display(Locale locale) {

		String name = messageSource.getMessage("member.name", null, locale);
		String birthplace = messageSource.getMessage("member.birthplace", null, locale);
		String hobby = messageSource.getMessage("member.hobby", null, locale);
		String age = messageSource.getMessage("member.age", new Object[] { "15" }, locale);

		System.out.println(locale);
		System.out.println(name);
		System.out.println(birthplace);
		System.out.println(hobby);
		System.out.println(age);

	}

}
