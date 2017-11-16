package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SetCharacterEncodingFilter implements Filter {

	private FilterConfig configer;  
      
    public void destroy() {  
        configer = null;  
    }  
  
    public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws IOException, ServletException {
    	response.setContentType("text/html;charset=UTF-8");
        chain.doFilter(request, response);
    }

	@Override
	public void init(FilterConfig config) throws ServletException {
		 this.configer = config; 
	}

    
}
