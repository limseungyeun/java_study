package staticex;
//static 변수는 "클래스가 메모리에 로딩될 때" 생성
//모든 객체가 공유
//객체 없이 사용 가능(클래스 이름으로 접근)
//한 번만 생성됨(끝까지)
	class Counter2 {
		static int cnt = 0; // static 변수(정적 변수, 클래스 변수)
		 // 객체마다 생기는 것이 아니라
        // 클래스 전체에서 단 하나만 존재함
		static void increase() { // static 메서드
			cnt++;	 // 공용 cnt를 1 증가
		}
	} 
public class StaticTest2 {
	public static void main(String[] args) {
		
		Counter2.increase(); // 클래스 이름으로 바로 호출 가능
		Counter2.increase(); // 공용 cnt가 또 증가

		System.out.println("count:"+Counter2.cnt);  // 2
	}

}
//static 메서드 안에서는 인스턴스 변수(static이 붙지 않은 변수)를 직접 사용할 수 없다.