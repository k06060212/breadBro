package chap06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
//		키보드로부터 숫자를 입력받아서
//		1부터 입력받은 수만큼의 배열에 담아서
//		배열의 내용을 반복문 for를 사용하여 출력하세요
//		(10을 입력하면 배열[0] = 1, 배열[1] = 2, ... 배열[9] = 10 이런 식으로 값을 넣어서 출력)
		
//		예)
//		숫자를 입력하세요 : 5
//		1
//		2
//		3
//		4
//		5
		
		System.out.println("숫자(n)를 입력하면 배열 형태로 1 ~ n까지 저장되어 출력됩니다.");
		System.out.print("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		
		int[] result = new int[in];
		
		for(int i = 0; i < result.length; i++) {
			result[i] += i + 1;			
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
