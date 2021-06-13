package chap16;

import java.util.Scanner;
import java.util.function.Predicate;

public class Sample18 {
	public static void main(String[] args) {
		Predicate<Integer> isOdd = (s) -> (s % 2) == 1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("짝수를 입력하세요 : ");
		sc.hasNextInt();
		System.out.println(isOdd.negate().test(sc.nextInt()));
	}
}

// 12라인에 negate() 메서드가 추가되어서 결괏값이 반대로 처리되게 하였습니다.