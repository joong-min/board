package Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// ctrl + shift + o : 자동 import
		// ctrl + shift + f : 자동 코드 정렬

		// Scanner를 이용해 입력값을 받아
		// 구구단을 원하는 단이 나오게 해주세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}

		// 예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

		// 4단 출력.

	}

}
