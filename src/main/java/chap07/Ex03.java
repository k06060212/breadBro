package chap07;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 임의의 숫자를 1에서 45까지의 수를 총 6개 추첨하여 당첨번호를 구한다.
		// 중복된 숫자는 있으면 안 된다.
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)((Math.random() * 45) + 1);
			if(i > 0 ) {
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		
		// 정렬해서 출력
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
		for(int i : lotto) {
			System.out.print("[" + i + "]");
		}
		
	}
}
