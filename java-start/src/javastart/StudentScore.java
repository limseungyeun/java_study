package javastart;

import java.util.Scanner;

class StudentP{
	String name;
	int score;
	  StudentP(String name, int score) {
		this.name=name;
		this.score=score; 
	}
}

public class StudentScore {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		//학생 수 키보드로 부터 입력
		System.out.println("반학생 수 입력하세요:");
		int cnt = sc.nextInt();
		sc.nextLine();
		//학생 수 만큼 배열 생성
		StudentP [] stu = new StudentP[cnt];
		//반복문을 통해서 배열 요소 객체 생성
		// 값을 키보드로부터 입력 받음
		for(int i=0;i<stu.length;i++) {
			System.out.println((i+1)+"번째 학생 이름 입력:");
			String name = sc.nextLine();
			System.out.println((i+1)+"번째 학생 점수 입력:");
			int score = sc.nextInt();
			sc.nextLine();
			stu[i] = new StudentP(name,score);
		}
		//이름 검색
		while(true) {
			System.out.println("검색하실 이름을 적어주세요: ");
			String sname = sc.nextLine();
			
			if(sname.equals("그만")) break;//while 문을 탈출
			boolean k = false;
			for(int j=0; j<stu.length; j++) {
				if(stu[j].name.equals(sname)) {
					System.out.println(sname+"의 점수는:"+stu[j].score);
					k=true;
					break;	//for문을 탈출, break는 가장 가까운 반복문을 한번만 탈출한다.
				}//if	
			}//for
			if(k) {//boolean은 기본값 true → false이면 !(not)
				System.out.println("찾는 사람이 없습니다.");
			}//if
			
		}//while
		sc.close();
		System.out.println("프로그램을 종료합니다");
	}//main

}//class

