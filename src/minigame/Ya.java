package minigame;

import java.util.Scanner;

public class Ya {
	public static void clover4() {
		System.out.println("'┌───────────┐'");
		System.out.println("'│ 4         │'");
		System.out.println("'│           │'");
		System.out.println("'│           │'");
		System.out.println("'│     ♣     │'");
		System.out.println("'│           │'");
		System.out.println("'│           │'");
		System.out.println("'│         4 │'");
		System.out.println("'└───────────┘'");
	}
	public static void heartA() {
		System.out.println("'┌───────────┐'");
		System.out.println("'│ A         │'");
		System.out.println("'│           │'");
		System.out.println("'│           │'");
		System.out.println("'│     ♥     │'");
		System.out.println("'│           │'");
		System.out.println("'│           │'");
		System.out.println("'│         A │'");
		System.out.println("'└───────────┘'");
	}
	public static void king() {
		System.out.println("'┌───────────┐'");
		System.out.println("'│ K         │'");
		System.out.println("'│           │'");
		System.out.println("'│           │'");
		System.out.println("'│     ♛     │'");
		System.out.println("'│           │'");
		System.out.println("'│           │'");
		System.out.println("'│         K │'");
		System.out.println("'└───────────┘'");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int myChoice;
		int random = (int)(Math.random()*3)+1;
		System.out.println(random);
		boolean onOff = true;

		while (onOff == true) {

			System.out.println(" 카드 맞추기");
			System.out.println("==============");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 종료");
			System.out.println("==============");
			System.out.print("선택: ");
			myChoice = scanner.nextInt();
			int cardChoice;
			
			switch (myChoice) {
			case 1:
				clover4();
				heartA();
				king();

				System.out.println("카드를 골라주세요 (위에서부터 1~3)");
				System.out.print("입력: ");
				cardChoice = scanner.nextInt();
				if (cardChoice == 1) {

				}

				break;
			case 2:
				System.out.println("게임이 종료되었습니다.");
				onOff = false;
				break;
			default:
				System.out.println("\n잘못된 입력입니다.\n");
				break;
			}
		}
	}

}