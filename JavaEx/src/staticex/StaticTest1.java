package staticex;

class Counter{
	int cnt = 0; //일반 변수
	 // 객체가 생성될 때마다 각 객체가 따로 갖는다.

	void increase() { // 일반 메서드(인스턴스 메서드)
		cnt++;   // 자기 자신의 cnt를 1 증가
	}
}
public class StaticTest1 {
	public static void main(String[] args) {
		Counter c1 = new Counter();  // Counter 객체 1개 생성
		Counter c2 = new Counter();  // Counter 객체 또 1개 생성
		
		// c1과 c2는 서로 다른 객체
        // 따라서 cnt도 각각 따로 존재함
		
		c1.increase(); //c1의 cnt만 증가 → c1.cnt=1
		c2.increase(); //c1의 cnt만 증가 → c1.cnt=1
		
		System.out.println("c1:"+c1.cnt); //1
		System.out.println("c2:"+c1.cnt); //1
	}
}
	//일반 변수는 각각의 객체마다 기억장소가 보관된다

