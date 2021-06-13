package chap16;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Sample24 {
	
	public static void main(String[] args) {
		String greeting = "Hello";
		Consumer<String> consumer = System.out::println;	// static 메서드 참조
		consumer.accept(greeting);
		
		writeString(greeting::toString);
	}
	
	public static void writeString(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}
}

// 11라인에서 넘어온 인자가 println() 메서드를 참조 메서드로 consumer에 넘겨서 accept() 메서드를 통해서 출력됩니다. 
// Consumer 함수형 인터페이스 1개의 매개변수가 있고 반환형 자료형은 없습니다.
// System.out.println() 메서드가 Consumer 함수형 인터페이스에 적합한 형태를 갖추고 있기 때문에 참조 할 수 있습니다.