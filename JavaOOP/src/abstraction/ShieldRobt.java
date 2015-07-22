package abstraction;

public class ShieldRobt extends BasicBot{
	private int shieldPint;
	
	public void Shield(int energy, int speed, int shieldPint)
	{
		super.charge(energy);
		super.run(speed);
		this.shieldPint = shieldPint;
	}
	
	public void status(){
		super.status();
		System.out.println("로봇 방어력 : " +this.shieldPint);
	}
}
