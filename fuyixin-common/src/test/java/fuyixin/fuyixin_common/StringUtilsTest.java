package fuyixin.fuyixin_common;

import com.fuyixin.common.utils.StringUtil;

public class StringUtilsTest {
	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		String src="aaa";
		boolean b = stringUtil.hasLength(src);
		System.out.println(b);
		String src1="";
		boolean hasText = stringUtil.hasText(src1);
		System.out.println(hasText);
		String src2="13845647541";
		boolean mobile = stringUtil.isMobile(src2);
		System.out.println(mobile);
		String src3="709624950@qq.com";
		boolean email = stringUtil.isEmail(src3);
		System.out.println(email);
	}
}
