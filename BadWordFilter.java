package in.abc.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

import in.abc.customization.CustomizedRequest;

/**
 * Servlet Filter implementation class BadWordFilter
 */
@WebFilter("/test")
public class BadWordFilter implements Filter {
       
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("Pre-Processing logic of filter");
		
		CustomizedRequest req1 = new CustomizedRequest((HttpServletRequest)request);

		// pass the request along the filter chain
		chain.doFilter(req1, response);
		System.out.println("Post Processing logic of filter");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
