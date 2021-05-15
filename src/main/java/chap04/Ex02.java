package chap04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/**
		 * 100점 만점의 학점을 입력받아서 
		 * 90점 이상이면 A, 
		 * 80점 이상이면 B, 
		 * 70점 이상이면 C, 
		 * 60점 이상이면 D, 
		 * 60점 미만이면 F를 구하는 프로그램을 작성하세요.
		 *(입력받는 점수는 0점에서 100점 사이의 값만 넣어야 함) 
		 */
		
		System.out.println("학점을 출력합니다.");
		System.out.println("점수를 입력하세요 > ");
		
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		
		if(in >= 90) {
			System.out.println("A 학점입니다.");
		}else if(in >= 80) {
			System.out.println("B 학점입니다.");
		}else if(in >= 70) {
			System.out.println("C 학점입니다.");
		}else if(in >= 60) {
			System.out.println("D 학점입니다.");
		}else if(in < 60) {
			System.out.println("E 학점입니다.");
		}else {
			System.out.println("1~100점 사이의 점수를 입력하지 않았거나 바르지 않은 점수입니다.");
		}
		
		String score = "";
		
		score = (in >= 90) ? "A" : (in >= 80) ? "B" : (in >= 70) ? "C" : (in >= 60) ? "D" : (in < 60) ? "E" : "1~100점 사이의 점수를 입력하지 않았거나 바르지 않은 점수입니다."; 
		
		System.out.printf("학점(%d)은 %s입니다.", in, score);
	}

}
