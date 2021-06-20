package chap07Ex;

import java.util.Scanner;

/**
 * @author k0606
 *
 * 전기세를 계산하는 프로그램을 작성
 * 전력 사용량은 201 ~ 400kwh 이하구간이다.
 * 기본요금 : 1,600원
 * 1단계 : 200kwh * 93.3원(1~200kwh까지는 93.3원이다.)
 * 2단계 : 200kwh * 187.9원(201~400kwh까지는 187.9원이다.)
 * 사용량은 키보드로부터 입력 받아서 계산한다.
 * - 소수점 이하 절사방법(Math.floor(n)으로 절사 예>Math.floor(93.3);)
 * - 소수점 이하 반올림방법(Math.rount(n)로 반올림 예> Math.rount(93.3);)
 *	
 * 사용량 201kwh는 1,600 + 18,847원 20,447원
 * 부가가치세(원미만 4사5입) : 20,447원 * 0.1 = 2,045원
 * 전력산업기반기금(10원미만 절사) : 20,447 * 0.037 = 750원
 * 청구금액(전기요금계 + 부가가치세 + 전력산업기반기금) : 20,447원 + 2,045 + 750 = 23,240원(10원미만 절사)
 */
public class ex04_tex {
	public static void main(String[] args) {
		int 	target 	= 201;	// 전력 사용량
		int 	basic 	= 1600;	// 기본요금
		float 	cost 	= 0;	// 전력 단가
		int 	vat		= 0;
		double 	total 	= 0; 	// 총 누적 사용요금
		int 	amt 	= 0;	// 최종 청구금액
		for(int i = 1; i <= target; i++) {
			if(i > 0 && i <= 200) {
				cost = 93.3f;
			}else {
				cost = 187.9f;
			}
			
			total += cost;
		}
		// 기본요금 + 총 누적 사용요금
		total = basic + Math.floor(total);
		vat = (int)Math.round(total / 10);
		amt = (int)total + vat + (int)(Math.floor((total * 0.037) / 10) * 10);
		amt = (int)(Math.floor(amt / 10) * 10); 	// 10원 미만 절사
		System.out.println("청구금액 : " + amt);
	}
}
