package chap08.vo;

public class Sample17 {

	public static void main(String[] args) {
		Student st = new Student("빵형", 21, 1);
		Student st2 = st;
		System.out.println(st.toString());
		System.out.println(st);
		System.out.println(st2);
		System.out.println(st.equals(st2));
		
		// 어떤 값이 들어있나...
	}
}

class Student{
	String name;
	int age;
	int grade;
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	
	// 어떤 값이 들어있나... 출력할 수 있게 된다. 
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}
