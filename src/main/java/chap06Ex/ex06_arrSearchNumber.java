package chap06Ex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author k0606
 *
 * 문제 :	보기와 같이 배열에 입력된 값을 입력받아서
 * 		몇 번 검색하여 찾았는지 선형 검색을 통한 소스코드를 작성하세요.
 * 
 * 보기 :	4, 6, 9, 2
 * 
 * 예  :	검색할 값이 존재하는 경우)
 * 		검색할 값을 입력하세요 : 2
 * 		4번 검색하여 값을 찾았습니다.
 * 		
 * 		검색할 값이 존재하지 않는 경우)
 * 		검색할 값을 입력하세요 : 5
 * 		찾을 수 없는 값입니다.
 */
public class ex06_arrSearchNumber {
	public static void main(String[] args) {
		int[] num = new int[] {4, 6, 9, 2};
		
		System.out.print("검색할 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		String result = "";
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == in) {
				result = (i+1) + "번 검색하여 값을 찾았습니다.";
				break;
			}
		}
		
		if("".equals(result)) {
			System.out.println("찾을 수 없는 값입니다.");
		}else {
			System.out.println(result);
		}
	}
}
