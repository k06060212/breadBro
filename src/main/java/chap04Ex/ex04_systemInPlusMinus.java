package chap04Ex;

import java.util.Scanner;

/**
 * @author k0606
 * 
 * 문제 : 정수의 값을 입력받고 입력받은 값이 양의 정수이면 그냥 출력하고, 
 * 		 음의 정수이면 양의 정수로 변환하여 출력하세요.
 */
public class ex04_systemInPlusMinus {
	public static void main(String[] args) {
		System.out.println("입력 받은 값이 양의 정수이면 그대로, 음의 정수이면 양수로 출력됩니다.");
		System.out.println("정수의 값을 입력하세요!");
		
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		
		int result = in > 0 ? in : (in * -1);
		
		if(in > 0) {
			System.out.printf("입력 받은 값은 %d, 양의 정수입니다. >>> 출력 : %d", in, result);
		}else {
			System.out.printf("입력 받은 값은 %d, 음의 정수입니다. 양의 정수로 변환 됩니다. >>>  출력 : %d", in, result);
		}
	}
}
