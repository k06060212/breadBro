package chap16;

public class Sample05 {
	public static void main(String[] args) {
		Sample05Function r = (t) -> {
			String result = "";
			for(int i = 0; i < t; i++) {
				result += "만세\n";
			}
			return result;
		};
		System.out.println("=== 만세 삼창 ===");
		System.out.println(r.test(3));
	}
}

@FunctionalInterface
interface Sample05Function{
	public abstract String test(int times);
}

/*
	19라인 반환형은 String 인자로는 int형으로 함수형 인터페이스를 정의했습니다.
	
	05라인에서 매개변수를(t)로 받았습니다.
	
	매개변수가 1개이면 괄호를 생략할 수도 있습니다.
	
	t는 int형으로 따로 정의하지 않아도 컴파일러가 추론할 수 있습니다. 앞서 배운 var라고 생각하면 됩니다.
	
	이런식으로 함수형 인터페이스를 먼저 만들고 람다식을 구현한 후에 15라인에서 람다식을 호출하면 됩니다.
	
*/