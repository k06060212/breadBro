package chap02;

import java.util.Scanner;

// Scanner
public class Sample12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("int �ڷ����� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		System.out.print("char �ڷ����� �Է��ϼ��� : ");
		int b = sc.next().charAt(0);
		
		System.out.print("long �ڷ����� �Է��ϼ��� : ");
		long c = sc.nextLong();
		
		System.out.print("double �ڷ����� �Է��ϼ��� : ");
		double d = sc.nextDouble();
		
		System.out.print("String �ڷ����� �Է��ϼ��� : ");
		String e = sc.next();
		
		System.out.println("int : " + a);
		System.out.println("char : " + b);
		System.out.println("long : " + c);
		System.out.println("double : " + d);
		System.out.println("String : " + e);
	}
}
