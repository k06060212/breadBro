package chap05;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
//		구입할 물건의 목록과 구입한 물건의 목록이 보기와 같이 있을 때 구입하지 않는 물건을 출력하세요
		
//		구입할 물건 ["냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"]
//		구입한 물건 ["노트북", "TV", "에어컨"]
		
		String[] toBuy = {"냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"};
		
		String[] buy = {"노트북", "TV", "에어컨"};
		
		String[] result;
		
//		System.out.println(Arrays.equals(buy, nbuy));
		
		Arrays.sort(toBuy);
		Arrays.sort(buy);
		
		System.out.println(Arrays.toString(toBuy));
		System.out.println(Arrays.toString(buy));
		
		
		for(int i=0; i < toBuy.length; i++) {
//			int idx = Arrays.binarySearch(toBuy, buy[i]); 0, 2, 5
//			System.out.println(idx);
			for(int j = 0; j < buy.length; j++) {
				if(toBuy[i] != buy[j] ) {
					
				}
			}
		}		
		
//		for(int i=0; i < buy.length; i++) {
//			for(int o=0; o < toBuy.length; o++) {
//				
////				Static int binarySearch(Object[] a, Object key)
////				- 이진 검색 알고리즘을 사용하여 지정된 값을 배열에서 찾아서 인덱스를 반환
////			
////				Static int binarySearch(Object[] a, int formIndex, int toIndex, Object key)
////				- 이진 검색 알고리즘을 사용하여 지정된 값을 배열의 지정된 범위 내에서 찾아서 인덱스를 반환
//				
//				if() {
//					
//					
//					
////					List<String> result  = Arrays.asList(toBuy[i]);
////					System.out.println("result : " + result);
////					break;
//				}
//			}
//		}		
	}
}
