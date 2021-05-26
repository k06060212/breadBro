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
		
		System.out.println("== 구입하지 못한 물건 ==");
		System.out.printf("%s", Arrays.binarySearch(buy, toBuy[0]) < 0 ? toBuy[0] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(buy, toBuy[1]) < 0 ? toBuy[1] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(buy, toBuy[2]) < 0 ? toBuy[2] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(buy, toBuy[3]) < 0 ? toBuy[3] + "\n" : "");
		System.out.printf("%s", Arrays.binarySearch(buy, toBuy[4]) < 0 ? toBuy[4] + "\n" : "");
		
	}
}
