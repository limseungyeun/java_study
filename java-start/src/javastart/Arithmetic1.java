package javastart;

public class Arithmetic1 {
    //main 매서드
	public static void main(String[] args) {
		int x=20;
		int y=10; 
		int	res1 = add(x,y);	//매서드 호출
		//x,y → 인수
        int res2= sub(x,y);
        System.out.println(res1);
        System.out.println(res2);
             
	}
	//add 매서드
	public static int add(int a, int b){
		//int a, int b :매개변수
		return a+b; //반환
	}
	//sub 매서드
	public static int sub(int a, int b){
		return a-b;
	}
}
	