package Test;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		
		// 1. 선언
		// 배열
		int[] arr = new int[3];
		
		// 리스트
		ArrayList<Integer> alist = new ArrayList<>();
		
		// 2. 추가
		// 배열 - 없음 (구현해야함)
		// 리스트 - add()
		arr[0] = 1;
		arr[1] = 2;
		
		alist.add(1); // index 필요 X 
		alist.add(2); // index 필요 X
		
		// 3. 접근
		// 배열
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		// 리스트 - get()
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		
		// 4. 삭제
		// 배열 - 없음
		// 리스트 - remove();
		alist.remove(0);
		System.out.println(alist.get(0));
		
		// 5. 수정
		// 배열
		arr[0] = 2;
		arr[1] = 3;
		// 리스트 - set()
		alist.set(0, 10);
		
		System.out.println(alist.get(0));
		
		// 6. 길이 정보
		// 배열 - 원본 길이
		// 리스트 - 데이터 개수
		System.out.println(arr.length);
		alist.add(3);
		System.out.println(alist.size());
		
		
	}

}


