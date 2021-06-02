package chap08.vo;

import java.util.Arrays;

public class Sample18 {
	
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("빵형", 21, 1);
		students[1] = new Student("빵동생", 22, 3);
		students[2] = new Student("빵친구", 25, 2);
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("--------------------");
		for(int i = 0; i  < students.length; i++) {
			System.out.println(students);
			
			Student s = students[i];
			System.out.println(s);
		}
		
		System.out.println("------------스트림 람다식--------");	
		Arrays.stream(students)
			.forEach(s -> System.out.println(s));
		
		System.out.println("----------스트림 메소드 참조----------");	
		Arrays.stream(students)
		.forEach(System.out::println);
	}
}
