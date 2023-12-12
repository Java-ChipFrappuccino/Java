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
        String star;
        double rating;
        // ------------------------리뷰 읽기----------------------------
        {
            FileInputStream fis = new FileInputStream("res/review");
            Scanner scanner = new Scanner(fis);
            star = scanner.next();
            rating = Double.parseDouble(star);
            name = scanner.next();
            review = scanner.nextLine();

            scanner.close();
            fis.close();
        }
        // ------------------------리뷰 출력----------------------------
        {
            if (rating == 5.0) {
                System.out.println("★★★★★ " + rating);
            } else if (4.0 <= rating && rating < 5.0) {
                System.out.println("★★★★ " + rating);
            } else if (3.0 <= rating && rating < 4.0) {
                System.out.println("★★★ " + rating);
            } else if (2.0 <= rating && rating < 3.0) {
                System.out.println("★★ " + rating);
            } else if (0.0 <= rating && rating < 2.0) {
                System.out.println("★ " + rating);
            }
            System.out.println("작성자: " + name);
            System.out.print("┌─────────────────────────────────┐\n");
            System.out.println("리뷰: " + review);
            System.out.print("└─────────────────────────────────┘\n");
        }
        // ------------------------리뷰 입력----------------------------
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n★ ☆ ★ ☆ ★ 별점 입력: ");
            star = scanner.nextLine();
//			rating = Double.parseDouble(star);
//            scanner.nextLine();
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
            ps.printf("%s %s %s", star.substring(0, (star.indexOf(".") + 2)), name, review);

            ps.close();
            fos.close();
        }
    }
}
