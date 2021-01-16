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

public class LogFilter implements Filter{

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		       //초기화
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;//상속????
		
		String remoteAddr = req.getRemoteAddr();
		String uri = req.getRequestURI();
		String url = req.getRequestURL().toString();
		String queryString = req.getQueryString();
		
		String refer = req.getHeader("refer");//접속 경로
		String agent = req.getHeader("User-Agent");//브라우저 정보 가져오기
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("* remoteAddr:"+remoteAddr+"\n");
		sb.append("* uri:"+uri+"\n");
		sb.append("* url:"+url+"\n");
		sb.append("* queryString:"+queryString+"\n");
		sb.append("* refer:"+refer+"\n");
		sb.append("* agent:"+agent);
		
		logger.info("LOG FILTER\n"+sb);
		
		chain.doFilter(req, response);
		
		
	}

	@Override
	public void destroy() {
			   //종료
		
	}
	
	

}
