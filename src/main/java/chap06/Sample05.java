package chap06;

public class Sample05 {
//	거꾸로 된 삼각형 모양으로 '#' 출력 역 피라미드형
	public static void main(String[] args) {
		//	#########		// 9
		// 	 #######
		//	  #####
		// 	   ###
		//	    #
		// 초기식과 증감식이 1개만 오는게 아니다.
		for(int i = 0, j = 9; i < 5; i++, j-=2) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int h = 0; h < j; h++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
