package com.mvc.ex01.common.filter;

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
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = req.getRemoteAddr();
		String uri = req.getRequestURI();
		String url=req.getRequestURL().toString();
		String queryString = req.getQueryString();
		String refer=req.getHeader("refer");
		String agent=req.getHeader("User-agent");
		String cookie=req.getHeader("cookie");
		String lang=req.getHeader("accept-language");
		String connection=req.getHeader("connection");
		
		StringBuffer sb = new StringBuffer();
		sb.append("* remoteArrd///"+remoteAddr+"\n");
		sb.append("* uri///"+uri+"\n");
		sb.append("* url///"+url+"\n");
		sb.append("* queryStrig///"+queryString+"\n");
		sb.append("* refer///"+refer+"\n");
		sb.append("* agent///"+agent+"\n");
		sb.append("* cookie///"+cookie+"\n");
		sb.append("* accept-language///"+lang+"\n");
		sb.append("* connection///"+connection+"\n");
		
		logger.info("LOG FILTER\n"+sb);
		chain.doFilter(req, response);
		
	}

	@Override
	public void destroy() {
		
		
	}
	
	

}
