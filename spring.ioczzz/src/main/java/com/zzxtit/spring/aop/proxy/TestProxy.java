package com.zzxtit.spring.aop.proxy;

import org.junit.Test;

import com.zzxtit.spring.aop.BankService;
import com.zzxtit.spring.aop.BankServiceImpl;

public class TestProxy {
	
	@Test
	public void test() {
		BankService bs = new BankServiceImpl ();
		
		BankService proxyBs = (BankService) new ServiceProxy().createProxyInstance(bs);
		
		proxyBs.withdraw("123");
	}

}
