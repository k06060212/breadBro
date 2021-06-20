package chap08Ex;

import java.util.Scanner;

/**
 * @author k0606
 * 
 * 문제 :	100이하의 정수를 입력받아서 for문을 사용하지 않고 
 * 		메서드만을 활용하여 1부터 입력받은 수까지의 합을 구하는 코드를 작성하세요
 * 		(단 '0(영)'을 입력하면 프로그램을 종료합니다.)
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		do{
			System.out.print("100이하의 정수를 입력해주세요 : ");
			int in = sc.nextInt();			
			if(in > 100) {
				System.out.println("큰 값을 입력했습니다.");
			}else if(in == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println(sum(in));
			}
					
		}while(true);
	}
	
	public static int sum(int in) {
		int ret;
		if(in > 0) {
			ret = in + sum((in-1));
		}else {
			ret = 0;
		}
		return ret;
	}
}

