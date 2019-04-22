package com.fuyixin.common.utils;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtil {
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public String getString(HttpServletRequest request, String name, String defaultValue){
		String value=request.getParameter(name);
		//Enumeration parameterNames = request.getParameterNames();
		if(value==null){
			return defaultValue;
		}
		return value;
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request, String name, int defaultValue){
		Object value = request.getParameter(name);
		if(value==null || !(value instanceof Integer)){
			return defaultValue;
		}
	    return (Integer) value;
	}
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(HttpServletRequest request, String name, int defaultValue){
		Object value = request.getParameter(name);
		if(value==null || !(value instanceof Boolean)){
			return false;
		}
		return (Boolean) value;
	}
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
		StringBuffer url = request.getRequestURL();
		request.getContextPath();
		return url.toString();
	    //实现代码
	}
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(String cookieName,HttpServletRequest request){
		Cookie[] cookies = request.getCookies();
		if(cookies!=null &&cookies.length>0){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals(cookieName)){
					return cookie.getValue();
				}
			}
		}
		return null;
	    //实现代码
	}



}
