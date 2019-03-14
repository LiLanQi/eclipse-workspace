package test.temp;

public class Hospital {
	
	/**
	 * 病人
	 */
	class PatientThread extends Thread{

		private int age;//年龄
		private String name;//姓名
		private NurseService nurseService;
		
		public PatientThread(int age, String name, NurseService nurseService) {
			this.age = age;
			this.name = name;
			this.nurseService = nurseService;
		}

		@Override
		public void run() {
			System.out.println(name+"找护士打针......");
			nurseService.inject(name);//相当于告诉护士我要打针
		}
	}
	
	/**
	 * 护士
	 */
	class NurseService{

		public void inject(String name) {
			synchronized (this){
				System.out.println(name+"1、护士取出装药的安剖瓶；");
				System.out.println(name+"2、使用注射器抽取药物；");
				System.out.println(name+"3、准备好消毒棉签，止血带；");
				System.out.println(name+"4、使用消毒棉签擦拭打针部位；");
				System.out.println(name+"5、开始注射");
				System.out.println(name+"6、正在注射");
				System.out.println(name+"7、注射结束；");
				System.out.println(name+"8、拔出注射器并使用止血带止血；");
			}
		}
	}
	
	public static void main(String[] args) {
		Hospital test = new Hospital();
		NurseService nurseService = test.new NurseService();
		test.new PatientThread(30, "小林", nurseService).start();
		test.new PatientThread(8, "小王", nurseService).start();
		test.new PatientThread(79, "老林", nurseService).start();
	}
}
