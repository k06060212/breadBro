//package chap09Ex;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
///**
// * @author k0606
// *
// * 문제 :	Data라는 자료형을 만들고 특정 값이 들어왔을 때 오름차순과 내림차순을 처리하는 클래스를 각각 만들고
// * 		처리하는 메서드는 sort() 메서드로 처리하게 구현하세요.(다형성 활용)
// * 		
// * 입력값 예 :	
// * 			1 2 6 9 4
// * 출력값 예 :
// * 			오름차순 : [1, 2, 4, 6, 9]
// * 			내림차순 : [9, 6, 4, 2, 1]
// */
//public class ex01_2 {
//	public static void main(String[] args) {
//		Data asc = new AscData();
//		asc.setData(1, 2, 6, 9, 4);
//		asc.sort();
//		System.out.println("오름차순 : " + asc.toString());
//		Data des = new DesData();
//		des.setData(1, 2, 6, 9, 4);
//		des.sort();
//		System.out.println("내림차순 : " + des.toString());
//	}
//}
//
//class AscData extends Data{
//	@Override
//	public void sort() {
//		//Ascending
//		Integer tmp;
//		for(int i = 0; i < data.length - 1; i++) {
//			for(int idx = i + 1; idx < data.length; idx++) {
//				if(data[i] > data[idx]) {
//					tmp = data[i];
//					data[i] = data[idx];
//					data[idx] = tmp;
//				}
//			}
//		}
//	}
//	
//}
//
//class DesData extends Data{
//	@Override
//	public void sort() {
//		//Desending
//		Integer tmp;
//		for(int i = 0; i < data.length - 1; i++) {
//			for(int idx = i + 1; idx < data.length; idx++) {
//				if(data[i] > data[idx]) {
//					tmp = data[i];
//					data[i] = data[idx];
//					data[idx] = tmp;
//				}
//			}
//		}
//	}
//}