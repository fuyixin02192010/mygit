package com.fuyixin.common.utils;

import javax.servlet.http.HttpServletRequest;

public class WebUtil {
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public boolean getString(HttpServletRequest request, String name, String defaultValue){
		return false;
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(int a){
		return a;
	    //实现代码
	}
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(String src){
		return false;
	}
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
		return null;
	    //实现代码
	}
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(String aa){
		return aa;
	    //实现代码
	}



}
