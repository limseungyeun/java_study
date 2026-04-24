package javastart;

class Circle {
	int radius;
	
	double getArea() {
		return 3.14*radius*radius;
	}
	public Circle(int radius) {
		this.radius =radius;
	}
}






public class Array1 {

	public static void main(String[] args) {//실행
		Circle [] c; 
		c = new Circle[5]; // 5개의 방(빈방) 
		//Circle [] c = new Circle[5];
		
		for(int i=0; i<c.length ;i++) {
			c[i] = new Circle(i);
		}
		for(int r=0; r<c.length ;r++) {
			System.out.println(c[r].getArea());
		}
				
	}
}