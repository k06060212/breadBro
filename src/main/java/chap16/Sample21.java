package chap16;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Sample21 {
	
	public static void main(String[] args) {
		// Function은 매개변수와 반환 자료형을 각각 정의
		Function<String , String> sourceFile = p -> p + ".java";
		
		// UnaryOperator은 매개변수와 반환 자료형을 하나로 정의
		UnaryOperator<String> classFile = (String p) -> p + ".class";
		
		System.out.println(sourceFile.apply("Sample21"));
		System.out.println(classFile.apply("Sample21"));
	}
}

// Function 함수형 인터페이스와 비슷하며
// 메서드도 똑같은 기능으로 제공, 다만 Function을 이용할 때는 매개변수 자료형과 반환형 자료형을 각각 정의했다면
// UnaryOperator 함수형 인터페이스에서는 매개변수와 같은 자료형으로 반환형 자료형을 사용하게 됩니다.


// 10라인은 Function을 이용하여 매개변수와 반환 자료형을 각각 정의해서 람다식을 작성하였고 
// 13라인은 매개변수와 반환 자료형이 같을 경우에 사용하는 UnaryOperator 함수형 인터페이스로 사용
// 10라인의 Function처럼 매개변수와 반환 자료형이 같다면 UnaryOperator를 이용하여도 좋습니다.

// 매개변수로 10라인의 p는 매개변수가 1개라서 괄호를 생략했고 제네릭 타입으로 인해서 자료형을 생략했씁니다. 
// 13라인의 매개변수는 제네릭 타입에 <String>이라고 되어있지만, 굳이 매개변수 p의 자료형에 String을 넣어서 구현했습니다.
// String 자료형이 아닌 다른 자료형을 사용하면 당연히 오류가 발생

// 매개변수가 2개인 함수형 인터페이스 
// 기존 - Function<T, R> - 매개변수 T와 변환 자료형 R
// 		 BiFunction<T, U, R> - 첫 번째 매개변수 T, 두 번째 매개변수 U와 반환 자료형 R

// Predicate<T> - 매개변수 T와 반환 자료형은 boolean
// BiPredicate<T, U> - 첫 번째 매개변수 T, 두 번째 매개변수 U와 반환 자료형 boolean

