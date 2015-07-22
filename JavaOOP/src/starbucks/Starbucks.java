package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
		
		Scanner	scanner = new Scanner(System.in);
		Recipe coffee = new Coffee();
		Recipe tea = new Tea();		
		
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("주문한 커피가 무설탕일경우 1, 설탕일경우 2번을 입력하세요");
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		System.out.println("\n");
		
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("주문한 홍차가 레몬일경우 3, 자몽일경우 4번을 입력하세요");
		tea.select(scanner.nextInt());
		tea.serve();
		
	}
}
