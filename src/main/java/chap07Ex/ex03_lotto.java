package chap07Ex;

import java.util.Arrays;
import java.util.Random;

/**
 * @author k0606
 *
 * 문제 :	로또 추첨 번호를 예상하는 프로그램을 작성하세요.
 * 
 * 		임의의 숫자를 1에서 45까지의 수를 총 6개 추첨하여 당첨번호를 구한다.
 * 		중복된 숫자는 있으면 안 된다.
 */
public class ex03_lotto {
	public static void main(String[] args) {
		Random random = new Random();		
		int[] Lotto = new int[6];
		for(int i = 0; i < Lotto.length; i++) {
			Lotto[i] = random.nextInt(45) + 1;		
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(Lotto[i] == Lotto[j]) {
						i--;
						break;
					}
				}
			}
		}
		Arrays.sort(Lotto);
		System.out.printf("%d %d %d %d %d %d", Lotto[0], Lotto[1], Lotto[2], Lotto[3], Lotto[4], Lotto[5]);
		
	}
}
