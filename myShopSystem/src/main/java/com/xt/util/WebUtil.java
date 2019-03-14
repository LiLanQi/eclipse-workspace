package com.xt.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WebUtil {
	/**
	 * 封装request.getParameter()获取对象类
	 *
	 * @author 李银霞
	 */
	public static <T> T param2Bean(HttpServletRequest request, T t) {
		// 获得参数map
		Map<String, String[]> parameterMap = request.getParameterMap();
		try {
			// 将一个Map集合中的数据封装到指定对象bean中
			BeanUtils.populate(t, parameterMap);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return t;
	}
}
