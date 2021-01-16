package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 초기화

	}

	/*
	 * filter:서블릿 실행전  or 서블릿 실행 후 클라이언트에게 도착전 
	 * ex)클라이언트가 보낸 데이터의 암호를 해제하거나, 서블릿이 실행되기 전 필요한 자원을 미리 준비하거나,
	 *    서블릿이 실행될 때마다 로그를 남긴다거나 하는 작업을 필터를 통해 처리할 수 있다.
	 */
	
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		

        HttpServletRequest req = (HttpServletRequest)request; //상속 어쩌구 저쩌구???
		
		String remoteAddr = req.getRemoteAddr();//ip주소
		String uri = req.getRequestURI();
		String url = req.getRequestURL().toString();
		String queryString = req.getQueryString();//파라미터 쿼리 String (문자열 정보)
		
		String refer = req.getHeader("refer");//이전 url페이지
		String agent = req.getHeader("User-Agent");//클라이언트 기본정보()
		String cookie=req.getHeader("cookie");
		String lang=req.getHeader("accept-language");
		String con=req.getHeader("connection");
		String accept=req.getHeader("accept");

		

		
		//StringBuffer:문자열을 추가하거나 변경 할 때 주로 사용하는 자료형
		StringBuffer sb = new StringBuffer();
		
		sb.append("* remoteAddr:"+remoteAddr+"\n");
		sb.append("* uri:"+uri+"\n");
		sb.append("* url:"+url+"\n");
		sb.append("* queryString:"+queryString+"\n");
		sb.append("* refer:"+refer+"\n");
		sb.append("* agent:"+agent+"\n");
		sb.append("* cookie:"+cookie+"\n");
		sb.append("* accept-language:"+lang+"\n");
		sb.append("* connection:"+con+"\n");
		sb.append("* accept:"+accept);
		
		logger.info("LOG FILTER\n"+sb);
		
		chain.doFilter(req, response);
		
		
	}

	
	
	@Override
	public void destroy() {
		// 종료

	}

}
