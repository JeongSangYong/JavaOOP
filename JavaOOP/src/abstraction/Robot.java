package abstraction;

public interface Robot {
	
	public void charge(int energy);	//로봇이 공격하는 기능
	public void run(int speed);		//로봇이 움직이는 기능
	public void status();	//로봇의 상태 모니터링
}
