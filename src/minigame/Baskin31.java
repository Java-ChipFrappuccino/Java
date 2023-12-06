package minigame;

import java.util.Scanner;

public class Baskin31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count;
		int com;
		boolean onOff = true;

		while (onOff) {
			System.out.println("베스킨라빈스31");
			System.out.println("==============");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 종료");
			System.out.println("==============");
			System.out.print("선택: ");
			int myChoice = scanner.nextInt();
			System.out.println();
			switch (myChoice) {
			case 1:
				count = 0;
				while (true) {
					System.out.println("1 ~ 3중에 고르세요");
					System.out.print("선택: ");
					myChoice = scanner.nextInt();
					for (int i = 0; i < myChoice; i++) {
						count++;
						System.out.println(count + "!");
						if (count == 31) {
							System.out.println("\n====패배했습니다ㅠ====\n");
							break;
						}
					}
					if (count >= 31) {
						break;
					}
					System.out.println("컴퓨터차례");
					com = (int) (Math.random() * 3) + 1;
					for (int i = 0; i < com; i++) {
						count++;
						System.out.println(count + "!");
						if (count == 31) {
							System.out.println("\n====승리했습니다!====\n");
							break;
						}
					}
					if (count >= 31) {
						break;
					}
				}
				break;
			case 2:
				onOff = false;
				break;
			}
		}
	}
}

//			com = (int) (Math.random() * 3) + 1;
//			System.out.println("현재 숫자: " + count);
//			
//			if (myChoice == 1 && com == 1) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
//				count += 1;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
//				count += com;
//			} else if (myChoice == 1 && com == 2) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
//				count += 1;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
//				count += com;
//			} else if (myChoice == 1 && com == 3) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
//				count += 1;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
//				count += com;
//				
//			} else if (myChoice == 2 && com == 1) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
//				count += 2;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
//				count += com;
//
//			} else if (myChoice == 2 && com == 2) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
//				count += 2;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
//				count += com;
//			} else if (myChoice == 2 && com == 3) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
//				count += 2;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
//				count += com;
//
//			} else if (myChoice == 3 && com == 1) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
//				count += 3;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
//				count += com;
//			} else if (myChoice == 3 && com == 2) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
//				count += 3;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
//				count += com;
//			} else if (myChoice == 3 && com == 3) {
//				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
//				count += 3;
//				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
//				count += com;
//				}
//			}
//			
//		System.out.println("게임종료");
