package Test;

public class Test5 {

	public static void main(String[] args) {
		//사용법
//		String.substring(5) //문자열  start위치부터 끝까지 문자열 자르기
//		String.substring(3, 6) //문자열  start위치 부터 end전까지 문자열 발췌
				

		//예제
		String str = "ABCDEFG"; //대상 문자열
		/*A=0 B=1 C=2 D=3 E=4 F=5 G=6의 index를 가진다.*/
				
		//str = str.substring(3); 
		/*substring(시작위치) 결과값 = DEFG*/

		str = str.substring(0, 5); 
		System.out.println(str);
		/*substring(시작위치,끝위치) 결과값 = DEF*/
	}

}
