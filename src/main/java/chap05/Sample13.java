package chap05;

import java.util.Arrays;

public class Sample13 {
	public static void main(String[] args) {
		/*
		4. Arrays.sort()
		- 배열의 내용을 오름차순으로 정렬하는 메서드
		- Arrays.sort(Object[] a)
			static void sort(Object[] a)
			- 배열의 내용을 오름차순으로 정렬
		
			static void sort(Object[] a, int fromIndex, int toIndex)
			- 배열의 지정된 범위의 내용만 오름차순으로 정렬
		*/
		
		String[] han = new String[]{ "라면", "미역국", "떡볶이", "수제비", "갈비탕", "순대국"};
		
		System.out.println("정렬 전 : " + Arrays.toString(han));
		
		// 정렬할 배열을 복사합니다.
		String[] han2 = Arrays.copyOf(han, han.length);	// 전체정렬 배열
		String[] han3 = Arrays.copyOf(han, han.length);	// 범위정렬 배열
		
		Arrays.sort(han2);
		Arrays.sort(han3, 3, 5);
		System.out.println("전체정렬 후 : " + Arrays.toString(han2));
		System.out.println("범위정렬 후 : " + Arrays.toString(han3));	// 1, 2번은 고정, 3번재부터 정렬
	}
}
