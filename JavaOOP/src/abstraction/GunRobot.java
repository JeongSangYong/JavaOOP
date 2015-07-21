package abstraction;

public class GunRobot extends BasicBot{
	private int attackPoint;
	
	public void attack(int energy, int speed, int attackPoint) {
		super.charge(energy);
		super.run(speed);
		this.attackPoint = attackPoint;
		
	}
	
	public void status(){
		super.status();
		System.out.println("로봇 공격력 : " +this.attackPoint);
	}


}
