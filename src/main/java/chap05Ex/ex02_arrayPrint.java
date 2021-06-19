package chap05Ex;

import java.util.Arrays;

/**
 * @author k0606
 *
 * 문제: 5행과 5열로 이루어진 2차원 배열을 아래의 예와 같이 배열에 데이터를 넣고 출력하세요.
 * 	   (빈 공간은 null입니다. 숫자 자료형인 경우는 0이 됩니다.)
 * 
 * 예: 5 x 5 형태
 * 						6
 * 					5	6
 * 				4	5	6
 * 			3	4	5	6
 *  	2	3	4	5	6	  
 */
public class ex02_arrayPrint {
	public static void main(String[] args) {
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
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));
	}
}
