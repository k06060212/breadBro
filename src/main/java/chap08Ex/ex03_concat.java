package chap08Ex;
/**
 * @author k0606
 *	
 * 문제 : concat() 메서드에 문자열로 넘어오는 다수의 인자를 붙여서 한 줄로 출력하는 메서드를 완성하세요.
 * 
 * 예) 
 * 		concat("학교종이", "땡땡땡");
 * 		출력 
 * 		학교종이땡땡땡
 * 
 * 		concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "롬복");
 * 		출력
 * 		객체지향패키지클래스객체접그넺어자롬복
 */
public class ex03_concat {
	public static void main(String[] args) {
		System.out.println(concat("학교종이", "땡땡땡"));
		System.out.println(concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "롬복"));
	}
	
	public static String concat(String word1, String word2) {
		return word1 + word2;
	}
	
	public static String concat(String word1, String word2, String word3, String word4, String word5, String word6) {
		return word1 + word2 + word3 + word4 + word5 + word6;
 	}
}
