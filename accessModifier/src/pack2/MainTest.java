package pack2;

import pack1.Parent; //public 클래스는 어느곳에서나 객체 생성이 가능하다 하지만 다른 패키지인 경우에는 import를 출력받는다

public class MainTest extends Parent { 
	public static void main(String[] args) {
		Parent pa = new Parent();
		Child ch = new Child();
		 System.out.println("=== 일반 객체 접근 ===");
		    System.out.println("public a ="+pa.a);
		    //System.out.println("protected b ="+pa.b);
		    //System.out.println("default c ="+pa.c);
		    //System.out.println("private d ="+pa.d); //동일 클래스가 아니여서 Parent에서 받으 수가 없다.
		      //자식 클래스 접근
		    ch.printChild();
	}

}
