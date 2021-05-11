package chap02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Sample17 {

	public static void main(String[] args) {
		// 클래스, 메서드, 변수명을 구분하는 이름을 식별자라고 한다.
		
//		String _ = "underscore"; // 사용할 수 없다. _' is a keyword from source level 9 onwards, cannot be used as identifier
//		System.out.println(_);
//		test("underscore");

		Function<String, String> f = a -> a;
//		Function<String, String> g = _ -> _;
		Function<String, String> g = a_ -> a_;
		
		// 대문자변경 : Ctrl + Shift + X
		// 소문자변경 : Ctrl + Shift + Y
		// 블록지정 : Alt + Shift + A
		
		/*
		 * Internet of thing
		 * Text box
		 * find keyword
		 * 
		 * 1. 카멜 표기법(Camel Case)
		 * internetOfThing
		 * textBox
		 * findKeyword
		 * 
		 * 2. 파스칼 표기법(Pascal Case)
		 * InternetOfThing
		 * TextBox
		 * FindKeyword
		 * 
		 * 3. 스네이크 표기법(Snake Case)
		 *  InternetOfThing 
		 *  TextBox         
		 *  FindKeyword     
		 *  
		 *  4. 케밥 표기법(Kebab Case)
		 *  Internet-of-thing 
		 *  Text-box         
		 *  Find-keyword    
		 */
		
//		String Internet-of-thing = "";	// -를 연산자로 인식하기 때문에 케밥 표기법을 사용할 수 없다.
		int Internet = 10;
		int of = 1;
		int thing = 2;
		int a = Internet-of-thing;
		String string = "asdf";
		Map mapData = new HashMap();

	}
//	public static void test(String _) {
//		System.out.println(_);
//	}
	
}
