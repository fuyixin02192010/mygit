package fuyixin.fuyixin_common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fuyixin.common.utils.CollectionUtil;

public class CollectionUtilTest {
	public static void main(String[] args) {
		CollectionUtil util = new CollectionUtil();
		Set<String> set=new HashSet<String>();
		boolean notEmpty = util.notEmpty(set);
		System.out.println(notEmpty);
		Map<Character, String> map=new HashMap<Character, String>();
		boolean notEmpty2 = util.notEmpty(map);
		System.out.println(notEmpty2);
	}
}
