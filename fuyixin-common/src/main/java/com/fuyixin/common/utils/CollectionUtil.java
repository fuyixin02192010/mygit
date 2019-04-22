package com.fuyixin.common.utils;

import java.util.Map;
import java.util.Set;

public class CollectionUtil {
	public static void main(String[] args) {
		
	}
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Set set){
	    if(set.isEmpty()){
	    	return true;
	    }else{
	    	return false;
	    }
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map map){
		 if(map.isEmpty()){
		    	return true;
		    }else{
		    	return false;
		    }
	}

}
