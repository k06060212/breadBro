package chap17;

import java.util.Arrays;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample03 {

	public static void main(String[] args) {
		DataObj[] data = {new DataObj(1, "빵형"), new DataObj(2, "상도"), new DataObj(3, "타노스")};
		Stream<DataObj> stm = Arrays.stream(data);
		stm.forEach(System.out::println);
		
		System.out.println();
		
		// 스트림 생성 후 바로 출력도 할 수 있습니다.
		Arrays.stream(data).forEach(System.out::println);
	}
}

@Data
@AllArgsConstructor
class DataObj{
	int no;
	String name;
}


/*
	Class를 이용한 참조 자료형을 사용하는 경우는 Stream 객체의 제네릭 타입을 이용해서 사용하면 됩니다.
	13라인과 같이 곡 스트림 객체에 배열을 스트림으로 변환하여 대입시켜서 14라인처럼 스트림 객체를 출력할 수도 있고
	19라인처럼 생성된 스트림을 바로 forEach() 메서드를 이용해서 출력할 수도 있습니다.
*/	