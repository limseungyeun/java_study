package pack2;

import pack1.Parent;

public class Child extends Parent{ //Parent에게서 상속
	public void printChild() {//설계도의 메서드는 호출해야 
		System.out.println("===자식 클래스 접근===");
		System.out.println("public a="+a);
		System.out.println("protected b="+b);
		//System.out.println("default c="+c); //디폴트는 자신과 같은 곳에 있는 패키지만을 접근 허용된다.
		//System.out.println("private d="+d); //동일 클래스 내에서만 허용된다.
	}
}
