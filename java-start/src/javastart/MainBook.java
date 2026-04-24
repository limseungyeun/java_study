package javastart;

class Book{ //클래스(설계도) 생성
	//클래스 = 멤버변수(필드)(속성) + 메서드(기능) 구성 -
 	String title; //멤버변수
	int price; //멤버변수
	//생성자의 오버로딩
	Book (String c, int d){//객체생성시 인자 2개
		title = c;
		price = d;
	}
	Book(String c){//객체생성시 인자 1개
		title = c;
		price = 0;
		
	}
	Book(){ //객체생성시 인자 0개
		title = "c언어의 정석";
		price = 0;
	}
	//메소드 정의(기능, 행위)
	void showPrice(){
		System.out.println(title+","+price);
	}
}

public class MainBook { //실행하는 클래스

	public static void main(String[] args) //main Method
	{
		Book myBook = new Book("자바의 정석",20000); //객체(인스턴스) 생성
		Book myBook2 = new Book("파이썬의 정석");
		Book myBook3 = new Book();
		//Student() : 클래스 
		//new : 객체 생성 연산자
		//s1(내가 만든거): 참조변수, 객체 생성
		//myBook.title = "자바의 정석"; // .(점)은 멤버 접근 연산자
		//myBook.price = 20000;
		
		myBook.showPrice();//메서드 호출
		myBook2.showPrice();//메서드 호출
		myBook3.showPrice();
		
		
		
	}

}

