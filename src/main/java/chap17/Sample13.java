package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sample13 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		
		System.out.println("* 직렬 스트림 forEach()로 출력");
		IntStream.rangeClosed(65, 69).forEach(x -> System.out.println((char)x));
		
		System.out.println("\n* 병렬 스트림 forEach()로 출력");
		IntStream.rangeClosed(65, 69).parallel().forEach(x -> System.out.println((char)x));
		
		System.out.println("\n 병렬 스트림 forEachOrdered()로 출력");
		IntStream.rangeClosed(65, 69).parallel().forEachOrdered(x -> System.out.println((char)x));
	}
}

// 병렬 스트림은 순서가 보장되지 않는데 forEachOrdered() 메서드로 출력하게 되면
// 순서를 보장받게 된 결과를 얻을 수 있는 것을 확인할 수 있다.