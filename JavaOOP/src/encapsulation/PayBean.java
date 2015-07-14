package encapsulation;

public class PayBean {
//	메소드는 선언부, 연산부 출력부로 나누고
//	bean 클래스라면 멤버필드, 멤버메소드
	
	//멤버필드
	private String name = "";
	private int pay, tax, realpay;
	
	//멤머메소드 영역이
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getTax() {
		int tax = 0;
		tax = (int) (pay * 0.1);		
		return tax;
	}
	public int getRealpay() {
		int realpay = 0;
		//realpay = pay - tax;이케하면 tax는 전역변수의 null값이 들어옴
		realpay = (pay - getTax());  //or this.getTax()
		return realpay;
	}

	public String toString() {
		
		return "["+name+"실급여]\n"
				+ "월급 : "+pay+"\n세금 : "+getTax()+"\n실급여 :"+getRealpay();
	}	
}
