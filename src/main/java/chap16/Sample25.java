package chap16;

import java.util.function.BiFunction;

public class Sample25 {

	public static void main(String[] args) {
		Math math = new Math();
		
		// 2개의 메서드를 갖고 1개의 반환형을 갖는 함수형 인터페이스
		BiFunction<Integer, Integer, Integer> minus1 = (a, b) -> math.minus(a, b);
		BiFunction<Integer, Integer, Integer> minus2 = math::minus;
		
		System.out.println("람다식 - " + minus1.apply(10, 2));
		System.out.println("메서드 참조 - " + minus2.apply(5, 2));
	}
}

class Math{
	// 2개의 인자를 갖고 int 반환형을 갖는 메서드
	public int minus(int a , int b) {
		return a - b;
	}
}

// minus()를 2개의 매개변수를 갖고 반환 값을 갖는 메서드로 작성
// 대응되는 함수형 인터페이스로는 BiFunction<T,R,U>이 있습니다.
// 이를 이용, 람다식과 메서드 참조 2가지 방법으로 구현

// 11라인 람다식으로 2개의 인자를 넣고 화살표 연산자(->)를 이용하여 minus() 메서드를 작성
// 12라인은 당연히 인자가 2개이고 반환형이 있으니까 이것이 생략되어 15라인에서 2개인 인자를 얻어서 3이라는 결과를 반환하여 출력하게 됩니다.