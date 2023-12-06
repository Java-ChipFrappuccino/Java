package minigame;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MiniGame {
    public static void main(String[] args) throws IOException {
//        boolean mainOnOff = true;
        mainmenu :while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("==============================");
            System.out.println(" _____   ___  ___  ___ _____");
            System.out.println("|  __ \\ / _ \\ |  \\/  ||  ___|");
            System.out.println("| |  \\// /_\\ \\| .  . || |__ ");
            System.out.println("| | __ |  _  || |\\/| ||  __|");
            System.out.println("| |_\\ \\| | | || |  | || |___");
            System.out.println(" \\____/\\_| |_/\\_|  |_/\\____/");

            System.out.println("==============================");
//                 _____   ___  ___  ___ _____
//                |  __ \ / _ \ |  \/  ||  ___|
//                | |  \// /_\ \| .  . || |__
//                | | __ |  _  || |\/| ||  __|
//                | |_\ \| | | || |  | || |___
//                 \____/\_| |_/\_|  |_/\____/

            System.out.println("게임을 골라주세요!\n");
            System.out.println("1.베스킨라빈스31 \n2.가위바위보");
            System.out.println("3.같은카드 맞추기 \n4.게임종료");
            System.out.print("선택: ");
            int select = scanner.nextInt();
            switch (select) {
                case 1: {
                    System.out.println(" ___                 _                   ___           _      _                           ___    _");
                    System.out.println("(  _`\\              ( )     _           |  _`\\        ( )    ( )     _                  /'_  ) /' )");
                    System.out.println("| (_) )   _ _   ___ | |/') (_)  ___     | (_) )   _   | |_   | |_   (_)  ___    ___    (_)_) |(_, |");
                    System.out.println("|  _ <' /'_` )/',__)| , <  | |/' _ `\\   | ,  /  /'_`\\ | '_`\\ | '_`\\ | |/' _ `\\/',__)    _(_ <   | |");
                    System.out.println("| (_) )( (_| |\\__, \\| |\\`\\ | || ( ) |   | |\\ \\ ( (_) )| |_) )| |_) )| || ( ) |\\__, \\   ( )_) |  | |");
                    System.out.println("(____/'`\\__,_)(____/(_) (_)(_)(_) (_)   (_) (_)`\\___/'(_,__/'(_,__/'(_)(_) (_)(____/   `\\____)  (_)");
// ___                 _                   ___           _      _                           ___    _
//(  _`\              ( )     _           |  _`\        ( )    ( )     _                  /'_  ) /' )
//| (_) )   _ _   ___ | |/') (_)  ___     | (_) )   _   | |_   | |_   (_)  ___    ___    (_)_) |(_, |
//|  _ <' /'_` )/',__)| , <  | |/' _ `\   | ,  /  /'_`\ | '_`\ | '_`\ | |/' _ `\/',__)    _(_ <   | |
//| (_) )( (_| |\__, \| |\`\ | || ( ) |   | |\ \ ( (_) )| |_) )| |_) )| || ( ) |\__, \   ( )_) |  | |
//(____/'`\__,_)(____/(_) (_)(_)(_) (_)   (_) (_)`\___/'(_,__/'(_,__/'(_)(_) (_)(____/   `\____)  (_)

//                    Scanner scanner1 = new Scanner(System.in);
                    int count;
                    int com;
//                    boolean onOff = true;

                    gameNo1:while (true) {
                        System.out.println("\n==============");
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
                                System.out.println("게임이 종료되었습니다");
                                System.out.println("아무키나 입력시 게임선택창으로 돌아갑니다");
                                System.in.read();
//                                onOff = false;
                                break gameNo1;
                        }
                    }
                }
                break;
                case 2: {
                    Scanner game = new Scanner(System.in);
//                    boolean onOff = true;
                    int win = 0;
                    int lose = 0;
                    int draw = 0;
                    System.out.println(" ___                  _                                                                                            ");
                    System.out.println("|  _`\\               ( )                     _");
                    System.out.println("| (_) )   _      ___ | |/')      ___    ___ (_)  ___   ___    _    _ __   ___     _ _      _ _  _ _      __   _ __");
                    System.out.println("| ,  /  /'_`\\  /'___)| , <     /',__) /'___)| |/',__)/',__) /'_`\\ ( '__)/',__)   ( '_`\\  /'_` )( '_`\\  /'__`\\( '__)");
                    System.out.println("| |\\ \\ ( (_) )( (___ | |\\`\\    \\__, \\( (___ | |\\__, \\\\__, \\( (_) )| |   \\__, \\   | (_) )( (_| || (_) )(  ___/| |");
                    System.out.println("(_) (_)`\\___/'`\\____)(_) (_)   (____/`\\____)(_)(____/(____/`\\___/'(_)   (____/   | ,__/'`\\__,_)| ,__/'`\\____)(_)");
                    System.out.println("                                                                                 | |           | |");
                    System.out.println("                                                                                 (_)           (_)");
// ___                  _
//|  _`\               ( )                     _
//| (_) )   _      ___ | |/')      ___    ___ (_)  ___   ___    _    _ __   ___     _ _      _ _  _ _      __   _ __
//| ,  /  /'_`\  /'___)| , <     /',__) /'___)| |/',__)/',__) /'_`\ ( '__)/',__)   ( '_`\  /'_` )( '_`\  /'__`\( '__)
//| |\ \ ( (_) )( (___ | |\`\    \__, \( (___ | |\__, \\__, \( (_) )| |   \__, \   | (_) )( (_| || (_) )(  ___/| |
//(_) (_)`\___/'`\____)(_) (_)   (____/`\____)(_)(____/(____/`\___/'(_)   (____/   | ,__/'`\__,_)| ,__/'`\____)(_)
//                                                                                 | |           | |
//                                                                                 (_)           (_)
                   gameNo2: while (true) {
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
//                            System.out.println("게임을 종료합니다.");
//                            onOff = false;

                            System.out.println("게임이 종료되었습니다");
                            System.out.println("아무키나 입력시 게임선택창으로 돌아갑니다");
                            System.in.read();
                            break gameNo2;
//                            onOff = false;
                        } else if (hand == 4) {
                            System.out.println("이긴 횟수: " + win + "번");
                            System.out.println("진 횟수: " + lose + "번");
                            System.out.println("비긴 횟수: " + draw + "번");
                            System.out.printf("승률:  %5.2f%% 입니다\n", (double) win / (win + lose + draw) * 100);
                        } else {
                            System.out.println("잘못된 선택입니다.");
                        }
                    }
                } break;
                case 3: {
                }
                case 4: {
                    System.out.println("게임이 종료되었습니다 (-.-) (_._)");
//                    mainOnOff = false;
                    break mainmenu;
                }
            }
        }
    }
}