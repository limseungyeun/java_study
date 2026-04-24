package javastart;

import java.util.Scanner; //java.util: 패키지 Scanner : 클래스

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 객체 생성
		// Scanner : 클래스 이름
		// System.in : 키보드로 입력
		// Scanner sc → Scanner(틀래스, 타입), sc → 참조변수 
    System.out.println("이름 입력");
    String name = sc.nextLine();
    System.out.println("주소 입력");
    String addr = sc.nextLine();
    System.out.println("나이를 입력하세요");	
    int age = sc.nextInt();
    System.out.println("몸무게를 입력하세요");
    double wei = sc.nextDouble();
    System.out.println("결혼여부(true or false");
    boolean mer = sc.nextBoolean();
    System.out.println("이름:   "+name);
    System.out.println("주소:   "+addr);
    System.out.println("나이:   "+age);
    System.out.println("체중:   "+wei);
    System.out.println("결혼:   "+mer);
    sc.close(); //입력도구 종료, 자원정리
	}

}
