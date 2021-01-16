package com.mvc.updown.validate;

import org.springframework.stereotype.Service;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator{
//@Service:해당 클래스 객체 생성하는 역할	
	
	/*
	 * Validator 
	 * A validator for application-specific objects.
	 * This interface is totally divorced from any infrastructureor context;
	 *  (이 인터페이스는 완전히 어떤 기반 시설 내용과 분리되어 있다.) that is to say it is not coupled to
	 * validating only objects in the web tier, the data-access tier, or the
	 * whatever-tier. 이것은 웹 단계, 데이터 접근 단계, 또는 어떤 단계에서 객체 만든 것과는 연결되어 있지 않다. As such
	 * it is amenable to being used in any layer of an application, (예를 들어 어플리케이션 어떤
	 * 부분에서도 사용한다.) and supports the encapsulation(캡슐보호) of validation logic as a
	 * first-class citizen in its own right. (그리고 일급 객체로서 로직을 만드는 캡술화를 지지 한다.) 
	 * 
	 * Find below a simple but complete Validator implementation, which validates that
	 * the various String properties of a User Login instance are not empty (that is
	 * they are not null and do not consist wholly of whitespace), and that any
	 * password that is present is at least 'MINIMUM_PASSWORD_LENGTH' characters in
	 * length.
	 * 
	 * public class UserLoginValidator implements Validator {
	 * 
	 * private static final int MINIMUM_PASSWORD_LENGTH = 6;
	 * 
	 * public boolean supports(Class clazz) { return
	 * UserLogin.class.isAssignableFrom(clazz); }
	 * 
	 * public void validate(Object target, Errors errors) {
	 * 
	 * ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
	 * "field.required"); ValidationUtils.rejectIfEmptyOrWhitespace(errors,
	 * "password", "field.required"); UserLogin login = (UserLogin) target; if
	 * (login.getPassword() != null && login.getPassword().trim().length() <
	 * MINIMUM_PASSWORD_LENGTH) { errors.rejectValue("password", "field.min.length",
	 * new Object[]{Integer.valueOf(MINIMUM_PASSWORD_LENGTH)},
	 * "The password must be at least [" + MINIMUM_PASSWORD_LENGTH +
	 * "] characters in length."); } } }
	 * 
	 * See also the Spring reference manual for a fuller discussion ofthe Validator
	 * interface and it's role in an enterpriseapplication.
	 */
	@Override
	public boolean supports(Class<?> clazz) {//밸리데이터 지원 여부
		
		
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		UploadFile file =(UploadFile) target;
		
		if(file.getMpfile().getSize()==0) {//회원 가입시 사용할 수 있따 아이디 잘못
			
			errors.rejectValue("mpfile", "fileNPE", "Please select a file");
		}                      //어디에서, 어떤 코드를,  안되면 return   04확인 하기.
	}
	

}
