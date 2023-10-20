package com.gl.propertiesDemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Configuration
public class CustomInterceptor implements HandlerInterceptor {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	// Logic to be executed before the request is processed
	return true; // Return 'true' to allow the request to proceed, or 'false' to stop processing the request
	}
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	// Logic to be executed after the request is processed, but before the view is rendered
	}
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	// Logic to be executed after the request is completed
	}
	}