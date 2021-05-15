package chap05;

import java.util.Arrays;

public class Sample14 {
	public static void main(String[] args) {
		/*
		 5. Arrays.binarySearch()
		- 이진 검색(Binary Search)은 배열에서 데이터를 탐색하는 알고리즘 중의 하나다.
		- 이진 검색은 데이터가 정렬되어야만 적용할 수 있으며
		- 배열의 가운데 있는 데이터와 대상 데이터를 비교해서 크면 오른쪽, 작으면 왼쪽에 위치하며
		- 다시 배열의 가운데 있는 데이터와 비교하며 값을 찾을 때가지 반복합니다.
		- 반복하면서 비교 할 때마다 비교 대상이 반으로 줄어들어 검색 속도를 높이는 것입니다.
		
		- Arrays.binarySearch(Object[] a, Object key) 메서드
			
			Static int binarySearch(Object[] a, Object key)
			- 이진 검색 알고리즘을 사용하여 지정된 값을 배열에서 찾아서 인덱스를 반환
		
			Static int binarySearch(Object[] a, int formIndex, int toIndex, Object key)
			- 이진 검색 알고리즘을 사용하여 지정된 값을 배열의 지정된 범위 내에서 찾아서 인덱스를 반환
		
		- 이진 검색은 기본적으로 정렬되어야 합니다.
		- 정렬되어 있지 않으면 검색되지 않을 수 있습니다.
		 */
		
		var students = new String[] {"스노우 화이트", "멀린", "레지나", "애버리지", "잭", "아더", "한스"};
		
		// 레드슈즈 주인공 '스노우 화이트'를 검색
		var sortedStudents = Arrays.copyOf(students, students.length);
		Arrays.sort(sortedStudents);	// 이진 탐색은 기본적으로 정렬이 되어야 한다.
		
		int idx = Arrays.binarySearch(sortedStudents, "스노우 화이트");
		System.out.println(Arrays.toString(sortedStudents));
		System.out.printf("%d 번째에 [%s]가 위치합니다.", (idx + 1), sortedStudents[idx]);
		
		// 27 라인에서 이름들을 배열에 넣습니다.
		
		// 30 라인에서 복사본을 만듭니다.
		
		// 31 라인에서 이진 검색을 위해 배열의 요소들을 오름차순 정렬합니다.
		
		// 33 라인에서 스노우 화이트를 검색합니다.

	}
}
