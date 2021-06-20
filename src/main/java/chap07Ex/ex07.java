package chap07Ex;

import java.util.Scanner;

/**
 * @author k0606
 * 
 * 문제 :	키보드로부터 문장을 입력받고 오른손으로 입력한 값과 왼손으로 입력한 값을 각각 구하는 프로그램을 작성하세요
 * 		(단, 입력 값은 영문 대소문자와 숫자로 제한합니다.)
 * 
 * 		오른손
 * 		A, B, C, D, E, F, G, Q, R, S, T, V, W, X, Z, 1, 2, 3, 4, 5
 * 		
 * 		왼손
 * 		H, I, J, K, L, M, N, O, P, U, Y, 6, 7, 8, 9, 0
 * 
 * 출력 예 :	입력값 : I am boy
 * 			왼손 : 3 오른손 : 4
 * 			
 */
public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		int left = 0;
		int right = 0;
		String str = sc.nextLine().toUpperCase();
		for(char c : str.toCharArray()) {
			switch(c) {
			case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'Q', 'R', 'S', 'T', 
					'V', 'W', 'X', 'Z', '1', '2', '3', '4', '5' -> left++;
			case 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'U', 'Y', '6', '7', '8', '9', '0' -> right++;
			}
		}
		
		System.out.printf("왼손 : %d\t오른손 : %d\n", left, right);
	}
}
