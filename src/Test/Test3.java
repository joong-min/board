package Test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("명령어 입력해주세요 :");
			String str = sc.next();
			if(str.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;				
			}
			
			if(str.equals("add")) {
				System.out.println("게시물 추가 기능 구현!!!!");
			}
		}

	}

}
