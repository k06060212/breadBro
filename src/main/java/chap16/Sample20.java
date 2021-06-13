package chap16;

import java.util.function.Predicate;

public class Sample20 {
	public static void main(String[] args) {
		// 3의 배수이거나 홀수인 수를 출력하세요
		int[] no = {1, 3, 6, 8};
		
		Predicate<Integer> isOdd = (s) -> (s % 2) == 1;	// 홀수인가
		Predicate<Integer> isMultipleThree = (s) -> (s % 3) == 0;	// 3의 배수인가
		
		for(int num : no ) {
			if(isOdd.or(isMultipleThree).test(num)) {
				System.out.printf("%d는 홀수이거나 3의 배수입니다.\n", num);
			}
		}
	}
}

// 8은 출력되면 안 됩니다.
// 10라인에서는 홀수를 판단하는 람다식을 정의하고 11라인에서는 3의 배수를 판단하는 식을 작성
// 13라인에서는 향상된 for문으로 배열의 요소를 하나하나 람다식에 모두 적용
// 적어도 하나의 식에만 참이 되면 true를 반환하게 14라인에서 or()메서드를 사용했습니다.
