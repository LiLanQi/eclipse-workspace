package com.xt.util;

import java.util.regex.Pattern;
/**
 * 检查是手机号还是邮箱类
 * 
 * @author 李岚祺
 */
public class ChechEmailAndMobile {

	public static boolean clickMail(String email){ 		
		String str="^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		boolean falg=false; 
		
		Pattern pattern = Pattern.compile(str);
		falg=pattern.matcher(email).matches(); 			 
		
	    return falg;
	 }
	
	//验证手机是否符合规定要求
	public static boolean clickMobile(String mobile){ 		
		String str="^((13[0-9])|(15[^4,\\D])|(14[57])|(17[0-9])|(18[0,0-9]))\\d{8}$";
		boolean falg=false; 
		
		Pattern pattern = Pattern.compile(str);
		falg=pattern.matcher(mobile).matches(); 			 
		
	    return falg;
	 }

}
