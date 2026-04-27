package exceptionex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		try {
			int n = sc.nextInt(); //정수 입력
			if(n % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
			
		} catch (InputMismatchException e) { //정수 입력해야하는데 문자 입력으로 예외 상황 발생
			System.out.println("잘못입력했습니다.\n정수를 입력해주세요");
		}
		finally {//예외 여부 관계 없이 항상 수행
			System.out.println("프로그램을 종료합니다");
			sc.close();
		}
	}
}
