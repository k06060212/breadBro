package chap02Ex;

import java.util.Arrays;

/**
 * @author k0606
 *
 * 문제 : 어느 고등학교의 학생 수만큼의 정수 자료형으로 배열을 만들어 보세요.
 * 
 * 	1학년은 1반부터 3반까지 있습니다. 1반은 12명, 2반 12명, 3반은 12명이 있습니다.
 *  2학년은 1반부터 3반까지 있습니다. 1반은 9명,  2반 12명, 3반은 10명이 있습니다.
 *  3학년은 1반부터 3반까지 있습니다. 1반은 7명,  2반 12명, 3반은 11명이 있습니다.  
 */
public class ex01_numberArray {
	public static void main(String[] args) {
		int[][][] schoolYear = new int[3][3][12];
		schoolYear[1][0] = new int[9];
		schoolYear[1][2] = new int[10];
		schoolYear[2][0] = new int[7];
		schoolYear[2][2] = new int[11];
		
		System.out.printf("1학년 1반은 %d명\n", schoolYear[0][0].length);
		System.out.printf("1학년 2반은 %d명\n", schoolYear[0][1].length);
		System.out.printf("1학년 3반은 %d명\n", schoolYear[0][2].length);
		System.out.printf("2학년 1반은 %d명\n", schoolYear[1][0].length);
		System.out.printf("2학년 2반은 %d명\n", schoolYear[1][1].length);
		System.out.printf("2학년 3반은 %d명\n", schoolYear[1][2].length);
		System.out.printf("3학년 1반은 %d명\n", schoolYear[2][0].length);
		System.out.printf("3학년 2반은 %d명\n", schoolYear[2][1].length);
		System.out.printf("3학년 3반은 %d명", schoolYear[2][2].length);
	}
}
