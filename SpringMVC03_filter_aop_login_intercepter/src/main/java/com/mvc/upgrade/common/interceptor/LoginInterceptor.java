package com.mvc.upgrade.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	/*
	 * prehandle:1,컨트롤러 실행 직전에 동작,2:Object handler: 핸들러 맵핑이 찾은 컨트롤러 클래스 객체이다.
	 * posthandle:컨트롤러 진입후 view가 afterCompletion:
	 * 
	 */

	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		logger.info("[intercepter]:preHandle");

		// 지웠다가 다해보기
/*
		if (request.getRequestURI().contains("/loginform.do") || 
				request.getRequestURI().contains("/ajaxlogin.do")||
				request.getSession().getAttribute("login")!=null) {

			return true;
		}
		
		if(request.getSession().getAttribute("login")==null) {
			
			response.sendRedirect("/loginform.do");
		}
*/
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("[intercepter]:postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		logger.info("[intercepter]:afterCompletion");
	}

}
