package test;

public class LocalVariable {

	{
		int x = 9;// ������еľֲ�����
		System.out.println("x=" + x);
	}

	static void show(int arg) {// ���������еľֲ�����
		if (arg == 1) {
			int y = 2;// �����еľֲ�����
			System.out.println("y=" + y);
		}
		// System.out.println(y);//�˴�����ʹ��y�ֲ�����
		System.out.println("arg=" + arg);
	}

	public static void main(String[] args) {
		new LocalVariable();// ����ִ�д�����еĴ���
		show(1);
	}
}
