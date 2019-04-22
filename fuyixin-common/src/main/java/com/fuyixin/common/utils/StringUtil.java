package com.fuyixin.common.utils;

public class StringUtil {
	public static void main(String[] args) {
		
	}
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public boolean hasLength(String src){
		
		if(src.length()>0 && src!=null){
			return true;
		}else{
			return false;
		}
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public boolean hasText(String src){
		if( src!=null && src.length()>0 && !src.equals(" ")){
			return true;
		}else{
			return false;
		}
	}
	//方法3：判断是否为手机号码 (5分)
	public boolean isMobile(String src){
	   String reg="[1]\\d{10}";
	   if(src.matches(reg)){
		   return true;
	   }else{
		   return false;
	   }
	}
	//方法4：判断是否为邮箱 (5分)
	public boolean isEmail(String src){
		   String reg="\\w+@[0-9a-z]{1,}\\.[a-z]{2,3}(\\.[a-z]{2,3})?";
		   if(src.matches(reg)){
			   return true;
		   }else{
			   return false;
		   }
	}
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public String reverse(String src){
		String newsrc="";
		if(src==null){
			return null;
		}
		for(int i=src.length()-1;i>=0;i--){
			newsrc+=src.charAt(i);
		}
		return newsrc;
	}

}
