package abstraction;

// 인터페이스인 product를 구현한 클래스
public class ProductSpec implements Product{
	private String company;	//제조사
	private String name; //이름
	private String serialNo; //시리얼 넘버
	@Override
	public void showInfo() {
		System.out.println("제조사 :" + this.company);
		System.out.println("제품명 :" + this.name);
		System.out.println("시리얼넘버 :" + this.serialNo);
		
	}
	@Override
	public void writeInfo(String company, String name, String serialNo) {
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
		
	}
}
