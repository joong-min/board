package Test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);

	    System.out.println("이름을 입력해주세요:");
	    String name = scan.next();
	    
	    System.out.println("나이를 입력해주세요:");
	    int age = scan.nextInt();

	    // 출력 : 안녕하세요 29세 홍길동입니다.
	    System.out.println("안녕하세요 " + age + "세 " + name + "입니다.");

	}
}
