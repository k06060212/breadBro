package chap16;

import java.util.Scanner;
import java.util.function.Predicate;

public class Sample19 {
	public static void main(String[] args) {
		Predicate<Integer> isOdd = (s)-> (s % 2) == 1;
		Predicate<Integer> isEven = Predicate.not(isOdd);
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		int myNum = sc.nextInt();
		if(isOdd.test(myNum)) {
			System.out.println("홀수를 입력하셨습니다.");
		}else if(isEven.test(myNum)) {
			System.out.println("짝수를 입력하셨습니다.");
		}
	}
}

// 9라인에 not() 메서드를 사용하여 반대의 결과가 나오는 람다식으로 변환하여 만들어서 
// 14라인에서 입력받은 값에 의해서 홀수인지 짝수인지를 판단하여 출력하는 프로그램 