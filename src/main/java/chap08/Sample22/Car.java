package chap08.Sample22;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//@Data
public class Car {
	@NonNull
	private String color;			// 차량색상
	private final int door;				// 문의 수
	private String manufacturer;	// 제조자
// 어노테이션이 어떻게 적용되는지 class 파일을 확인해본다.


}
