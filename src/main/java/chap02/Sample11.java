package chap02;

import java.util.Scanner;

//Scanner
public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String in = new String("�Է°�");
//		System.out.println(in);
//		String in = sc.next();	// Ű����κ��� ���ڿ��� �Է� �޴� ��
//		String in2 = sc.next();	// Ű����κ��� ���ڿ��� �Է� �޴� ��
//		int inNum = sc.nextInt();
//		long inLong = sc.nextLong();
//		char inChar = sc.next().charAt(0); 	
//		System.out.printf("�Է��� �� : %s\n���� �� : %d\n", in, in.length());
//		System.out.printf("�Է��� �� : %s\n���� �� : %d\n", in2, in2.length());
		
		// apple banana 
		// 1234 5678
		
		String in = sc.nextLine();
		
		System.out.printf("�Է��� �� : [%s]\n���� �� : %d\n", in.toUpperCase().trim()
				, in.toUpperCase().trim().length());
		
		// trim ���� ����
		
	}
}
