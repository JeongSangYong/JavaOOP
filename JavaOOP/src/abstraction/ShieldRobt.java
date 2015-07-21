package abstraction;

public class ShieldRobt extends BasicBot{
	private int Shield;
	
	public void Shield(int energy, int speed, int Shield)
	{
		super.charge(energy);
		super.run(speed);
		this.Shield = Shield;
	}
	
	public void status(){
		super.status();
		System.out.println("로봇 방어력 : " +this.Shield);
	}
}
