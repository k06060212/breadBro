package chap16;

import java.util.function.Supplier;

import lombok.Getter;

public class Sample27 {
	public static void main(String[] args) {
		Supplier<Name> supplier1 = () -> new Name();
		Name name1 = supplier1.get();
		System.out.println("람다식 - " + name1.getName());
		
		Supplier<Name> supplier2 = Name::new;
		Name name2 = supplier2.get();
		System.out.println("생성자 참조 - " + name2.getName());
	}
}

@Getter
class Name{
	private String name;
	
	public Name() {
		this.name = "람다";
	}
}

/*
 * 	supplier1에 정의된 람다식은 'new Name();'을 실행하여 Name() 생성자를 호출합니다.
 * 이렇게 생성된 Name 객체를 11라인의 name1에 인스턴스로 반환합니다.
 * 12라인에서 name1의 getName()메서드를 통해서 기본 생성자에서 정의된 '빵형'이라는 값을 출력하게 됩니다.
 * 
 * 14라인은 람다식 대신 생성자 참조하는 식을 넘겨서 똑같은 결과를 얻도록 합니다.
 * */
 