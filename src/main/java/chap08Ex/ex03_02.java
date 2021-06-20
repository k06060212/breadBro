package chap08Ex;
/**
 * @author k0606
 *
 * 문제 : 예제 03 가변 인자를 이용한 구현
 */
public class ex03_02 {
	public static void main(String[] args) {
		System.out.println(concat("학교종이", "땡땡땡"));
		System.out.println(concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "롬복"));
	}
	
	public static String concat(String... words) {
		String result = "";
		
		for(String w : words) {
			result += w;
		}
		
		return result;
	}
}
