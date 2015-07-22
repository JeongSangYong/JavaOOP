package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobt
		 
		 
		 출력
		 건로봇은 속도는 10, 에너지는 10, 공격력 50
		 -공격력은 인스턴스 변수로 int attackPoint
		 쉴드로봇 속도 20, 에너티 20, 방어력 50
		 -방어력은 인스턴스 변수로 int shieldPoint
		 */
		
		GunRobot gunrobot = new GunRobot();
		gunrobot.attack(10, 10, 50);
		
		ShieldRobt shieldRobt = new ShieldRobt();
		shieldRobt.Shield(20, 20, 50);
		
		Robot[] robots = new Robot[2];
		robots[0] = gunrobot;
		robots[1] = shieldRobt;
		
		for(Robot robot : robots){
			robot.status();
		}
		

	}
}
