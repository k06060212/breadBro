package chap04Ex;

import java.util.Scanner;

/**
 * @author k0606
 * 문제 : 100점 만점의 학점을 입력받아서 90점 이상이면 A
 * 		 80점 이상이면 B,
 * 		 70점 이상이면 C,
 * 		 60점 이상이면 D,
 * 		 60점 미만이면 F를 구하는 프로그램을 작성하세요.
 * 		 (입력받는 점수는 0점에서 100점 사이의 값만 넣어야 함)
 */
public class ex02_grade {
	public static void main(String[] args) {
		System.out.println("학점을 구하는 프로그램. (0점에서 100점 사이의 값만 넣으세요~)");
		System.out.print("점수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("점수값이 잘못되었습니다.");
		}else if(score >= 90){
			System.out.println("A 학점입니다.");
		}else if(score >= 80){
			System.out.println("B 학점입니다.");
		}else if(score >= 70){
			System.out.println("C 학점입니다.");
		}else if(score >= 60){
			System.out.println("D 학점입니다.");
		}else {
			System.out.println("F 학점입니다.");
		}
		
		String result = (score >= 90) ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : score >= 60 ? "D" : "F" ));
		
		System.out.printf("입력 받은 점수는 %d 학점은 %s 입니다.", score, result);
	}
}
