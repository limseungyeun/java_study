package javastart;

class Car{ 
 	String model; //멤버변수
	int speed; //멤버변수
	Car(String model, int speed){ //생성자(클래스 이름과 동일)
		this.model = model;
		this.speed = speed;
	
		//this: 왼쪽 변수-객체변수, 오른쪽 변수-매개변수
		//this: 객체 자신
	}
	Car(String model){ //생성자(클래스 이름과 동일)
		this.model = model;
		speed = 0;
	}
	Car(){ //생성자(클래스 이름과 동일)
		model = "트럭";
		speed = 0;
	}
	void printInfo(){
		System.out.println(model+","+speed);
	}
}

public class MainCar { //실행하는 클래스

	public static void main(String[] args) 
	{
		Car s1 = new Car("Sonata", 100); 
		Car s2 = new Car("Avante", 80);
		Car s3 = new Car("Avante");
		
		s1.printInfo();
		s2.printInfo();
		
		System.out.println("자동차 이름:"+ s1.model);
		System.out.println("마력      :"+ s1.speed);
		System.out.println("자동차 이름:"+ s2.model);
		System.out.println("마력      :"+ s2.speed);
	}

}
