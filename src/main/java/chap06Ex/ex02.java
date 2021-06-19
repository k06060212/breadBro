package chap06Ex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author k0606
 *
 * 문제 :	비트 연산을 활용하여 5문제의 답이 맞으면 1, 틀리면 0으로 연속해서 입력받습니다.
 * 		그리고 정답을 2진수로 갖고 있으며 비교하여 맞으면 O, 틀리면 X로 연속으로 출력하는 프로그램을 작성하세요.
 * 		(OX 문제 답안 맞추기)
 * 
 * 예시 :	답 입력 > 10110
 * 		정답	  > 11001	
 * 		결과 	  > oxxxx
 */		
public class ex02 {
	public static void main(String[] args) {
		System.out.println("5문제의 답을 맞으면 1, 틀리면 0으로 입력해주세요 예 : 00101");
		System.out.print("답 입력	>>> ");
		int[] rightAnswer = {1, 1, 0, 0, 1};
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		// 정답 출력
		System.out.print("정답  	>>> ");
		for(int n : rightAnswer) {
			System.out.print(n);
		}
		
		// 결과 출력
		System.out.print("\n결과  	>>> ");
		// toCharArray() 메서드를 이용한 문자열을 문자배열로 변환
//		System.out.println(in.toCharArray());
		int i = 0;
		for(char c : in.toCharArray()) {
			System.out.print((c & rightAnswer[i++]) == 1 ? "O" : "X");
		}
		
	}
}
