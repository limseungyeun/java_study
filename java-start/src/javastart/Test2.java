package javastart;

import java.util.Scanner; //Scanner 클래스 사용
//import는 ctrl+shift+o
public class Test2 {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드로 입력하기 위해
		//import java.util.Scanner
		//문자열 입력
		System.out.println("숫자를 입력하세요.");
			String input = scanner.nextLine(); //nextLine()는 문자열 1줄
			//문자열 → 숫자로 변환
				double d =  Double.parseDouble(input); //a(문자)를 → num(정수)
				//Integer(정수) : Wrapper class(래퍼 클래스)
				//Wrapper class: 기본형을 객체로 감싸는 클래스
				//기본형을 객체로 감싸는 클래스
				//숫자 → 문자열
				String str1 = Double.toString(d); //toString (문자로 변환)
										//toString: 앞에 타입 지정
				String str2 = String.valueOf(d); //valueOf
										//valueOf: 타입 관계없음
				//출력
				System.out.println("입력 문자열:"+d);
				System.out.println("숫자로 반환:"+d);
				System.out.println("다시 문자열로 변환(toString)"+str1);
				System.out.println("다시 문자열로 변환(valueOf)");
				scanner.close();
	}

}
