package chap07;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 전기세를 계산하는 프로그램을 작성
//		전력 사용량은 201 ~ 400kwh 이하구간이다.
//		기본요금 : 1,600원
//		1단계 : 200kwh * 93.3원(1~200kwh까지는 93.3원이다.)
//		2단계 : 200kwh * 187.9원(201~400kwh까지는 187.9원이다.)
//		사용량은 키보드로부터 입력 받아서 계산한다.
//		- 소수점 이하 절사방법(Math.floor(n)으로 절사 예>Math.floor(93.3);)
//		- 소수점 이하 반올림방법(Math.rount(n)로 반올림 예> Math.rount(93.3);)
		
//		사용량 201kwh는 1,600 + 18,847원 20,447원
//		부가가치세(원미만 4사5입) : 20,447원 * 0.1 = 2,045원
//		전력산업기반기금(10원미만 절사) : 20,447 * 0.037 = 750원
//		청구금액(전기요금계 + 부가가치세 + 전력산업기반기금)
//		: 20,447원 + 2,045 + 750 = 23,240원(10원미만 절사)
		
		System.out.println("전기세를 계산하는 프로그램");
		System.out.print("사용량을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int useCost = sc.nextInt();	// 사용량
		int bsCost = 1600;			// 기본요금
		double cost1 = 93.3;
		double cost2 = 187.9;
		double step1;
		double step2;
		double vat = 0.1;
		double elecFund = 0.037;
		
		
		
		if(useCost <= 400) {
			
			if(useCost <= 200) {
				step1 = useCost * Math.floor(cost1);

			}
			
			if(useCost > 200) {
					
			}
				
		}else {
			System.out.println("전력량 계산 범위는 201 ~ 400kwh 입니다.");
		}
	}
}
