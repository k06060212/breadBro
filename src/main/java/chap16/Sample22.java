package chap16;

import java.util.Arrays;
import java.util.List;

public class Sample22 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.forEach(Writer::doWrite);
	}
}

class Writer{
	public static void doWrite(Object msg) {
		System.out.println(msg);
	}
}

/* 메서드 참조의 종류 4가지
	1. static 메서드 참조
	2. 특정 개체의 인스턴스 메서드 참조
	3. 특정 타입의 임의 개체에 대한 인스턴스 메서드 참조
	4. 생성자 참조
	
	(Object name)::(Method name)
*/

// 1. static 메서드 참조
// 9라인에 출력하는 static 메서드인 doWrite()를 호출합니다.
// 여기에서 forEach() 메서드에 '다른 모든 클래스의 static 메서드를 사용해도 될까?'라는 의문이 들 수도 있습니다. 
// list.forEach((s) -> Writer.doWrite(s));로 바꿀 수 있다.