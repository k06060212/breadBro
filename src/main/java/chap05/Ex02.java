package chap05;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
//		5행과 5열로 이루어진 2차원 배열을 [아래의 예시와 같이] 데이터에 넣고 출력하세요
//		(빈 공간은 null입니다. 숫자 자료형인 경우는 0이 됩니다.)
		
// 		예) 5 x 5 배열
//		null, null, null, null, 6
//		null, null, null,  5,   6
//		null, null,  4,    5,   6
//		null,   3,   4,    5,   6
//		2,      3,   4,    5,   6
		
		int[][] arr = new int[5][5];
		
		arr[0][4] = 6;
		
		arr[1][3] = 5;
		arr[1][4] = 6;
		
		arr[2][2] = 4;
		arr[2][3] = 5;
		arr[2][4] = 6;
		
		arr[3][1] = 3;
		arr[3][2] = 4;
		arr[3][3] = 5;
		arr[3][4] = 6;
		
		arr[4][0] = 2;
		arr[4][1] = 3;
		arr[4][2] = 4;
		arr[4][3] = 5;
		arr[4][4] = 6;
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("");
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));
	}
}
