package test.temp;

public class Student{

	public String id;
	public String name;
	
	public Student(String id,String name) {
		this.id = id;
		this.name = name;
	}

	public Student(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "该生id=" + id + ", 姓名" + name;
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return this.id.equals(((Student)obj).id);
		}
		return false;
	}	
}
