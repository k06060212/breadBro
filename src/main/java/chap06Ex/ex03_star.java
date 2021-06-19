package chap06Ex;

/**
 * @author k0606
 *
 * 문제 :	반복문을 이용해서 다음과 같은 결과를 출력하세요.
 * 예시 :		   *
 * 			  ***
 * 			 *****
 * 			*******
 * 		   *********
 * 		
 */
public class ex03_star {
	public static void main(String[] args) {
		// 1, 3, 5, 7, 9 개의 *
		int line = 5; 
		
		for(int i = 0; i < line; i++) {
			for(int j = 0 ; j < line-(i+1); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i+(i+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
