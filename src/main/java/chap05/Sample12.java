package chap05;

import java.util.Arrays;

public class Sample12 {
	public static void main(String[] args) {
		/*
		 * 3. Arrays.copyOf()
		- 배열을 독같이 복사하되 지정한 길이까지만 정해서 복사할 수 있습니다.
		
		- Arrays.copyOf(Object[] original, int newLength) 메서드
			static Object[] copyOf(Object[] original, int newLength)
			- 배열의 길이만큼만 배열을 복사하여 변환
		
		- Arrays.copyOfRange(Object[] original, int from, int to) 메서드
			static Object[] copyOfRange(Object[] original, int from, int to)
			- 지정된 배열의 범위만 복사하여 반환 	
		 */
		String[] han1 = new String[]{ "라면", "미역국", "떡볶이", "수제비",	 "갈비탕", "순대국"};
		
		String[] han2 = Arrays.copyOf(han1, han1.length - 1);
		String[] han3 = Arrays.copyOf(han2, han2.length - 1);
		String[] han4 = Arrays.copyOf(han3, han3.length - 1);
		String[] han5 = Arrays.copyOf(han4, han4.length - 1);
		String[] han6 = Arrays.copyOf(han5, han5.length - 1);
		
		System.out.println(Arrays.toString(han2));
		System.out.println(Arrays.toString(han3));
		System.out.println(Arrays.toString(han4));
		System.out.println(Arrays.toString(han5));
		System.out.println(Arrays.toString(han6));
		
		System.out.println("\n첫 번째와 마지막 요소를 제거하고 복사하여 출력 ==");
		String[] cp = Arrays.copyOfRange(han1, 1, han1.length - 1);
		System.out.println(Arrays.toString(cp));
	}
}
