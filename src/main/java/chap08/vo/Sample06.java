package chap08.vo;

public class Sample06 {
	
	static int sum;
	
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	
	public static int sum(int a) {
		sum += a;
		if(a == 0) {
			return sum;
		}else {
			return sum(--a);
		}
	}
	
	/*
	 //메서드 구조
	  [접근 제어자]	(static) [반환 자료형] 메서드 명([매개변수]){
	  
	  }
	  	
	 // 생성자 구조
	   [접근 제어자] 클래스명(){
	   
	    }
	  */
}
