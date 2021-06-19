package chap05Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author k0606
 *
 * 문제 : 구입할 물건의 목록과 구입한 물건의 목록이 보기와 같이 있을 때 
 *       구입하지 못한 물건을 출력하세요.
 *       
 * 보기 :	구입할 물건 ["냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"]
 * 		구입한 물건 ["노트북", "TV", "에어컨"]
 */
public class ex03 {
	public static void main(String[] args) {
		// 구입하지 않을 물건은 
		// 구입할 물건에서 구입한 물건과 중복되는 것을 뺀
		// 냉장고, 선풍기, 세탁기가 되겠다.
		
		// 배열에서 저장 방법 1
		String[] exArr1 = new String[6];
		exArr1[0] = "냉장고";
		exArr1[1] = "선풍기";
		exArr1[2] = "TV";
		exArr1[3] = "노트북";
		exArr1[4] = "세탁기";
		exArr1[5] = "에어컨";
		System.out.println(Arrays.toString(exArr1) + " - 배열에서 저장 방법 2");
		
		// 배열에서 저장 방법 2
		String[] purchases = new String[] {"냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨"};
		String[] purchase = new String[] {"노트북", "TV", "에어컨"};
		System.out.println(Arrays.toString(purchases) + " - 배열에서 저장 방법 2");
		
		// 리스트 저장 방법 1
		List<String> exArr2 = new ArrayList<>();
		exArr2.add("냉장고");
		exArr2.add("선풍기");
		exArr2.add("TV");
		exArr2.add("노트북");
		exArr2.add("세탁기");
		exArr2.add("에어컨");
		System.out.println(exArr2 + " - 리스트 저장 방법 1");
		
		// 리스트 저장 방법 2
		List<String> exArr3 = Arrays.asList("냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨");
		System.out.println(exArr3 + " - 리스트 저장 방법 2");
		
		System.out.println("=================================================================");
		
		// 구입한, 구입할 물건의 정렬
//		Arrays.sort(exArr3);// The method sort(int[]) in the type Arrays is not applicable for the arguments (List<String>)
		Arrays.sort(purchases);
		Arrays.sort(purchase);
		System.out.println(Arrays.toString(purchases));
		System.out.println(Arrays.toString(purchase));
		
		// 구입하지 못한 물건을 저장할 배열 생성 
		// for 문을 이용
		System.out.println("==구입하지 못한 물건 리스트==");
		for(int i = 0; i < purchases.length; i++) {
			System.out.printf("%s", Arrays.binarySearch(purchase, purchases[i]) < 0 ? purchases[i]+"\n" : "");
		}
	}
}
