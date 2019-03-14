package com.test.two;
public enum Color {
	/*GREEN{
		@Override
		public String getColor() {
			return "绿色";
		}	
	},RED{
		public String getColor() {
			return "红色";
		}
	};
	public abstract String getColor();
	*/
	
	RED("1","红色"),GREEN("2","绿色");
	private String id;
	private String name;
	Color(String id,String name){
		this.id = id;
		this.name = name;
	}
	public static void test(Color color) {
		switch(color) {
			case GREEN:
				System.out.println("绿色");
				break;
			case RED:
				System.out.println("红色");
				break;
		}
	}	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
/**
 * 枚举中构造方法只能是private
 * 枚举中可以定义抽象方法，但枚举必须实现该抽象方法*/