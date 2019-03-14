package com.baidu;

import com.baidu.Body.Heart;

public class Woman {

	public static void main(String[] args) {
		Body body = new Body();
		body.walk();
		Heart heart = body.new Heart();
		heart.beat();
	}
}