package foodparty;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) throws IOException {
		String name;
		String review;
		double star;
		// ------------------------리뷰 읽기----------------------------
		{
			FileInputStream fis = new FileInputStream("res/review");
			Scanner scanner = new Scanner(fis);
			star = scanner.nextDouble();
			name = scanner.next();
			review = scanner.nextLine();

			scanner.close();
			fis.close();
		}
		// ------------------------리뷰 출력----------------------------
		{
			System.out.println("★ ☆ ★ ☆ ★ " + star);
			System.out.println("작성자: " + name);
			System.out.print("┌─────────────────────────────────┐\n");
			System.out.println("리뷰: " + review);
			System.out.print("└─────────────────────────────────┘\n");
		}
		// ------------------------리뷰 입력----------------------------
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("\n★ ☆ ★ ☆ ★ 별점 입력: ");
			star = scanner.nextDouble();
			scanner.nextLine();
//			star = Double.parseDouble(scanner.nextLine());
			System.out.print("작성자 입력: ");
			name = scanner.nextLine();
			System.out.print("┌─────────────────────────────────┐\n");
			System.out.print("리뷰 입력: ");
			review = scanner.nextLine();
			System.out.print("└─────────────────────────────────┘\n");
		}
		// ------------------------리뷰 저장----------------------------
		{
			FileOutputStream fos = new FileOutputStream("res/review");
			PrintStream ps = new PrintStream(fos);
			ps.printf("%f %s %s", star, name, review);

			ps.close();
			fos.close();
		}
	}

}
