package chap04Ex;

import java.util.Scanner;

/** 
 * @author k0606
 *
 * 문제 : 두 개의 값을 입력받아서 큰 수를 출력하세요.(단, 같으면 0으로 출력)
 */
public class ex01_biggerNumber {
	public static void main(String[] args) {
		System.out.println("두 개의 값을 입력 받아서 큰 수를 출력하세요.(단, 같으면 0이 출력됩니다.)");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.printf(">>> 더 큰 수는 %d 입니다.\n", a);
		}else if(a < b) {
			System.out.printf(">>> 더 큰 수는 %d 입니다.\n", b);
		}else {
			System.out.println(">>> 0");
		}
		
		int result = (a > b) ? a : ( (a < b) ? b : 0 );
		
		System.out.println("result : "+ result);
	}
}
