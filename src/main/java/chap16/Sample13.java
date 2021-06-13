package chap16;

import java.util.function.Function;

public class Sample13 {
	public static void main(String[] args) {
		// 입력된 문자열을 숫자로 변환
		Function<String, Integer> work = s -> {
			System.out.println("- 입력된 문자열을 숫자로 변환합니다.");
			return Integer.parseInt(s);
		};
		
		// 입력된 숫자를 문자열로 변환
		Function<Integer, String> after = i -> {
			System.out.println("- 입력된 숫자를 문자열로 변환합니다.");
			return "" + i; 
		};
		
		System.out.println("문자열 '123'을..");
		
		if(work.andThen(after).apply("123") instanceof String) {
			System.out.println("String입니다.");
		}else {
			System.out.println("String이 아닙니다.");
		}
	}
}

// work라는 람다식으로 문자열을 숫자로 변환하는 함수를 만들고 후처리로 숫자를 문자열로 변경하는 함수를 만들었습니다.

// andThen()메서드로 두 함수를 조립한 후에 apply()메서드에 숫자 값을 갖는 문자열 '123'을 넣었습니다.

// work 함수에서 문자열 '123'을 숫자 123으로 변환한 후에 이 결과를 after함수에서 다시 숫자 123을 문자열 '123'으로 변경하였습니다.

// 이 결과가 문자열 123이 맞는지 21라인에서 조건문에 instanceof로 자료형이 맞는지 비교합니다.

// 변환된 결과가 String이 맞으면 'String입니다.'가 출력되고, 아니면 'String이 아닙니다.'가 출력됩니다.
