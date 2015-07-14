package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 14
 * @ Author : JSY
 * @ Story : 카우푸지수 프로그램을 객체화 하는 예제
 * */

public class KaupBean2 {
	/*
	 * public은 은닉화가 되어 있지 않는 상태임
	 * 은닉화를 하려면 private를 넣어야함
	 * 그런데, 데이터 값은 private를 넣어야 하고
	 * 기능-메소드는 public을 넣어야함
	 * */	
	/*
	 * 자바의 계층 구조
	 * 프로젝트(어플리케이션) > 패키지 > 클래스 > 멤버
	 * 멤버는 두가지로 구성
	 * private으로 선언된 (감춰진) 속성 : 멤버필드
	 * public으로 선언된 (오픈된) 기능 : 멤버메소드
	 * */
	private String name, msg;
	private double height, weight;
	private int idx;
	
	public void getIndex() {	//메소드(동사)
		/*
		 * 카우푸지수는 키와 몸무게를 입력하면
		 * 저체중,정상,비만 이라는 결과값을 알려주는 프로그램
		 * 
		 * 콘솔에 출력되는 문장
		 * "[홍길동] 키 : 183cm, 몸무게 : 73kg, 키우푸지수 : 정상"
		 * 카우푸지수 공식 : (몸무게 / (키*키)) * 10000
		 * 30초과 비만
		 * 24초과 과체중
		 * 20초과 정상
		 * 15초과 저체중
		 * 13초과 마름
		 * 10 초과 영양실조
		 * */
		//선언부
		String name = "", msg = "";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; //카우푸 인덱스
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이릅을 입력하세요");
		name = scanner.next();
		System.out.println("키를 입력하세요");
		height = scanner.nextInt();
		System.out.println("몸무게를 입력하세요");
		weight = scanner.nextInt();
		//연산부
		idx = (int) ((weight/(height * height))*10000);
		
		if (idx > 30) {
			msg = "비만";
		}else if( idx > 24 ){
			msg = "과체중";
		}else if( idx > 20 ){
			msg = "정상";
		}else if( idx > 15 ){
			msg = "저체중";
		}else if( idx > 13 ){
			msg = "마름";
		}else{
			msg = "영양실조";
		}
		//출력부		
		System.out.println("["+name+"] 키 : "+height+"cm, "
				+ "몸무게 :" +weight+ "kg, 결과 : "+msg+ "카우푸지수"+idx);
	}
}
