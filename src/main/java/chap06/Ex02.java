package chap06;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
//		비트 연산을 활용하여 5문제의 답이 맞으면 1, 틀리면 0으로 연속해서 입력받습니다.
//		그리고 정답을 2진수로 갖고 있으며 
//		비교하여 맞으면 O, 틀리면 X로 연속으로 출력하는 프로그램을 작성하세요(OX문제 답안 맞추기)
		
//		답 입력 > 10110
//		정답	  > 11001
//		결과   > OXXXX
		
		int[] ox = {1, 1, 0, 0, 1};
		
		System.out.print("답 입력>");
		
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();		// 키보드로부터 값을 입력받는다.
		
		// 정답 출력
		System.out.print("정답  >");
		for(int n : ox) {
			System.out.print(n);
		}
		
		System.out.print("\n결과  >");
		int targetLoc = 0;
		for(char c : in.toCharArray()) {
			System.out.print((c & ox[targetLoc++]) == 1 ? "O" : "X");
		}
	}
}
