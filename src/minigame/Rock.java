package minigame;

import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {

		Scanner game = new Scanner(System.in);
		boolean onOff = true;
		int win = 0;
		int lose = 0;
		int draw = 0;

		System.out.println("         가위바위보 게임 시작");
		while (onOff) {
			int computer = (int) (Math.random() * 3) + 1;

			System.out.println("========================================");
			System.out.println("1.가위 2.바위 3.보 \n4.승률확인 5.게임종료");
			System.out.println("========================================");
			System.out.print("선택: ");
			int hand = game.nextInt();
			System.out.println();

			if (hand == 1 && computer == 1) {
				System.out.println("나: 가위 , 컴퓨터: 가위\n비겼습니다!\n");
				draw++;
			} else if (hand == 1 && computer == 2) {		 
				System.out.println("나: 가위 , 컴퓨터: 바위\n졌습니다!\n");
				lose++;
			} else if (hand == 1 && computer == 3) {
				System.out.println("나: 가위 , 컴퓨터: 보\n이겼습니다!\n");
				win++;
			} else if (hand == 2 && computer == 1) {
				System.out.println("나: 바위 , 컴퓨터: 가위\n이겼습니다!\n");
				win++;
			} else if (hand == 2 && computer == 2) {
				System.out.println("나: 바위 , 컴퓨터: 바위\n비겼습니다!\n");
				draw++;
			} else if (hand == 2 && computer == 3) {
				System.out.println("나: 바위 , 컴퓨터: 보\n졌습니다!\n");
				lose++;
			} else if (hand == 3 && computer == 1) {
				System.out.println("나: 보 , 컴퓨터: 가위\n졌습니다!\n");
				lose++;
			} else if (hand == 3 && computer == 2) {
				System.out.println("나: 보 , 컴퓨터: 바위\n이겼습니다!\n");
				win++;
			} else if (hand == 3 && computer == 3) {
				System.out.println("나: 보 , 컴퓨터: 보\n비겼습니다!\n");
				draw++;
			} else if (hand == 5) {
				System.out.println("게임을 종료합니다.");
				onOff = false;
			} else if (hand == 4) {
				System.out.println("이긴 횟수: " + win + "번");
				System.out.println("진 횟수: " + lose + "번");
				System.out.println("비긴 횟수: " + draw + "번");
				System.out.printf("승률:  %5.2f%% 입니다\n",(double)win/(win + lose + draw)*100);
			} else {
				System.out.println("잘못된 선택입니다.");
			}
//		if (computer-hand == 0) {
//			System.out.println("비겼습니다.");
//		} else if (computer-hand == 1 || computer-hand == -2) {
//			System.out.println("졌습니다.");
//		} else if (computer-hand == 2 || computer-hand == -1) {
//			System.out.println("이겼습니다.");
//		 if (computer-hand == 2 || computer-hand == -1) {
//			System.out.println("컴퓨터가 이겼습니다.");
//		} else if (hand-computer == 2 || hand-computer == -1) {
//			System.out.println("내가 이겼습니다.");
//		}
//		0비 1졋  2이
//		0비 1졋 -1이 
//		0비-2졋 -1이
		}
		
		

	}

}
