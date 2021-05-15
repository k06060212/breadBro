package chap05;

import java.util.Arrays;

public class Sample06 {
	public static void main(String[] args) {
		/**
		 * 역슬래시(/) 2개가 보인다.
		 * 역슬래시 한 개를 문자열로 출력하기 위해서는 연속 2개를 입력해야 한 개의 역슬래시가 출력된다.
		 * 역슬래시는 이스케이프 문자를 표현하기 위한 특수문자로 활용하기 때문이다.
		 * 
		 * 여기에서는 Dangling meta-characters라고 해서 
		 * 일부 문자열을 구분자로 바로 활용할 수 없는 문자열이 있다.
		 * 이때 역슬래시를 앞에 붙여서 일반 문자화해서 보여주면 구분자로 활용할 수 있다.
		 */
		
		String names = "빵형|상도|타노스|인호|학건";
		String[] arr = names.split("\\|");
		System.out.println("| : " + Arrays.toString(arr));
		
		String names1 = "빵형&상도&타노스&인호&학건";
		String[] arr1 = names1.split("\\&");
		System.out.println("& : " + Arrays.toString(arr1));
		
		String names2 = "빵형*상도*타노스*인호*학건";
		String[] arr2 = names2.split("\\*");
		System.out.println("* : " + Arrays.toString(arr2));
		
		String names3 = "빵형=상도=타노스=인호=학건";
		String[] arr3 = names3.split("=");
		System.out.println("= : " + Arrays.toString(arr3));
		
		String names4 = "빵형+상도+타노스+인호+학건";
		String[] arr4 = names4.split("\\+");
		System.out.println("+ : " + Arrays.toString(arr4));
		
		String names5 = "빵형^상도^타노스^인호^학건";
		String[] arr5 = names5.split("\\^");
		System.out.println("^ : " + Arrays.toString(arr5));
		
		String names6 = "빵형-상도-타노스-인호-학건";
		String[] arr6 = names6.split("\\-");
		System.out.println("- : " + Arrays.toString(arr6));
	
	}
}
