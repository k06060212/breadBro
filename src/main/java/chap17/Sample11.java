package chap17;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample11 {
	
	public static void main(String[] args) {
		// Stream을 활용하여 1부터 100까지의 배열 생성
		int[] numbers = IntStream.range(1, 101).toArray();
		// Stream을 활용하여 배열 출력
		Arrays.stream(numbers).forEach(System.out::println);
	}
}
