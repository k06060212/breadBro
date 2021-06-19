package chap06Ex;

import java.util.Scanner;

/**
 * @author k0606
 * 
 * 문제 :	키보드로부터 문자열을 입력받아서 
 * 		아스키코드표를 활용하여 암호화를 하고 
 * 		다시 암호화된 문자열을 복호화하는 프로그램을 작성하세요.
 * 
 * 보기 :	'A'를 입력하면 '>'로 출력. 아스키 코드값 '65'에서 3을 뺀 62번을 출력
 * 		'apple' -> '^mib'
 * 
 * 예  :	단어를 입력하세요	: apple
 * 		암호화 된 단어 	: ^mmib
 * 		복호화 된 단어 	: apple	 
 */
public class ex05_askii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String in = sc.next();
		String pass1 = "";
		String pass2 = "";
		
		for(char c : in.toCharArray()) {
			pass1 += (char)(c-3);
		}
		System.out.printf("암호화 된 단어 : %s", pass1);
		
		for(char c : pass1.toCharArray()) {
			pass2 += (char)(c+3);
		}
		System.out.printf("\n복호화 된 단어 : %s", pass2);
	}
}
