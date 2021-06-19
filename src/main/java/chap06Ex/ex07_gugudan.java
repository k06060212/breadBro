package chap06Ex;

/**
 * @author k0606
 *
 * 문제 :	구구단을 배열에 넣고 반복문을 통해서 배열을 출력하는 프로그램을 작성하세요.
 * 
 * 예  :	2차원 배열로 구구단의 결과 값을 배열에 담는다.
 * 		[2 x 1] [2 x 2] ... [2 x 9]
 * 		(중간 생략)
 * 		[9 x 1] [9 x 2] ... [9 x 9]
 * 
 * 		- 출력 결과(배열 요소 출력값 앞에 Tab으로 간격 조정 - System.out.print("\t" + y[j]);)
 * 			2	4	6	8	10	12	14	16	18
			3	6	9	12	15	18	21	24	27
			4	8	12	16	20	24	28	32	36
			5	10	15	20	25	30	35	40	45
			6	12	18	24	30	36	42	48	54
			7	14	21	28	35	42	49	56	63
			8	16	24	32	40	48	56	64	72
			9	18	27	36	45	54	63	72	81
 */
public class ex07_gugudan {
	public static void main(String[] args) {
		int[][] gugudan = new int[8][9];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 9; j++) {
				gugudan[i][j] = (i + 2) * (j + 1);
			}
		}
		
		for(int k=0; k < gugudan.length; k++) {
			int[] gugudanResult = gugudan[k];
			for(int l = 0; l < gugudanResult.length; l++) {
				System.out.print("\t" + gugudanResult[l]);
			}
			System.out.println();
		}
	}
}
