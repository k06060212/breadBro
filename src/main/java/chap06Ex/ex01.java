package chap06Ex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author k0606
 *
 * 문제 :	키보드로부터 숫자를입력받아서 1부터 입력받은 수만큼의 배열에 담아서 배열의 내용을
 * 		반복문 for를 사용하여 출력하세요.
 * 		(10을 입력하면 배열[0] = 1, 배열[1] = 2,...배열[9] = 10 이런 식으로 값을 넣어서 출력
 */
public class ex01 {
	public static void main(String[] args) {
		System.out.println("입력 받은 수에 따라 배열을 생성하고 값을 저장합니다.");
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		
		int[] arr = new int[in];
		
		for(int i = 0; i < in; i++) {
			arr[i] = i;
		}
		System.out.printf("입력 받은 수 %d 생성된 배열 >>> ",in );
		System.out.println(Arrays.toString(arr));
		
		System.out.println("생성된 배열을 for문으로 출력합니다.");
		for(int j = 0; j < in; j++) {
			System.out.println(arr[j]);
		}
		
	}
}
