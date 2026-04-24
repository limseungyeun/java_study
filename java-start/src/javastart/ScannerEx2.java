package javastart;

import java.util.Scanner;

public class ScannerEx2 {
     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 입력");
		String name=sc.nextLine();
		//문자열 입력 → 숫자 입력 → 문제없음
		//숫자 → 문자열 → 엔터키를 상쇄 sc.nextLine();
	    String pro = sc.nextLine();
	    System.out.println("가격");
	    int price = sc.nextInt();
	    System.out.println("수량");
	    double quan = sc.nextDouble();
	    System.out.println("회원여부 (true or false");
	    boolean men = sc.nextBoolean();
	    //총금액 
	    int tot = (int)quan * price;
	    //할인 적용 : 회원(true)이면 10%할인
	    if(men) {       //boolean이면 mem == true
	    	tot = (int)(tot * 0.9);
	    }
	    System.out.println("상품명:  "+pro);
	    System.out.println("가격:   "+price);
	    System.out.println("수량:   "+quan);
	    System.out.println("회원:   "+men);
	    
	    System.out.println(name);
	      System.out.println(price);
	      System.out.println(quan);
	      if(men) {
	      System.out.println("회원입니다");
	      }
	      else {
	         System.out.println("비회원입니다");
	      }
	    System.out.println(tot);
	    sc.close();

	}

}
