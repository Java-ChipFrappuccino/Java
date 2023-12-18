package foodparty;

import java.io.*;
import java.util.Scanner;

public class Review {
    String storeName;
    String name;
    String review;
    String star;
    int count = 0;
    double rating;
    Review[] reviews;
    // ------------------------리뷰 읽기----------------------------
    void Load() throws IOException {
        this.reviews = new Review[count];
        String line;
        String[] tokens;
        for (int i = 0; i < count; i++) {

            FileInputStream fis = new FileInputStream("res/"+storeName+"/review"+(i+1)+".txt");
            Scanner scanner = new Scanner(fis);
            line = scanner.nextLine();
            tokens = line.split("@");
            this.reviews[i].star = tokens[0];
            this.reviews[i].name = tokens[1];
            this.reviews[i].review = tokens[2];
            scanner.close();
            fis.close();
        }
    }

    // ------------------------리뷰 출력----------------------------
    void Print()
    {
        if (count == 0) {
            System.out.println("리뷰가 없습니다");
        } else {
            for (int i = 0; i < count; i++) {

                if (Double.parseDouble(reviews[i].star) == 5.0) {
                    System.out.println("★★★★★ " + reviews[i].star);
                } else if (4.0 <= Double.parseDouble(reviews[i].star) && Double.parseDouble(reviews[i].star) < 5.0) {
                    System.out.println("★★★★ " + reviews[i].star);
                } else if (3.0 <= Double.parseDouble(reviews[i].star) && Double.parseDouble(reviews[i].star) < 4.0) {
                    System.out.println("★★★ " + reviews[i].star);
                } else if (2.0 <= Double.parseDouble(reviews[i].star) && Double.parseDouble(reviews[i].star) < 3.0) {
                    System.out.println("★★ " + reviews[i].star);
                } else if (0.0 <= Double.parseDouble(reviews[i].star) && Double.parseDouble(reviews[i].star) < 2.0) {
                    System.out.println("★ " + reviews[i].star);
                }
                System.out.println("작성자: " + reviews[i].name);
                System.out.print("┌─────────────────────────────────┐\n");
                System.out.println("리뷰: " + reviews[i].review);
                System.out.print("└─────────────────────────────────┘\n");
            }
        }
    }

    // ------------------------리뷰 입력----------------------------
    void Write()
    {
        this.count++;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n★ ☆ ★ ☆ ★ 별점 입력: ");
        this.star = scanner.nextLine();
//			rating = Double.parseDouble(star);
//            scanner.nextLine();
//			star = Double.parseDouble(scanner.nextLine());
        System.out.print("작성자 입력: ");
        this.name = scanner.nextLine();
        System.out.print("┌─────────────────────────────────┐\n");
        System.out.print("리뷰 입력: ");
        this.review = scanner.nextLine();
        System.out.print("└─────────────────────────────────┘\n");
    }

    // ------------------------리뷰 저장----------------------------
    void Save() throws IOException {
//        this.count++;
        File storeDir = new File("res/" + storeName);
        if (!storeDir.exists()) {
            storeDir.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream("res/"+storeName+"/review"+this.count+".txt");
        PrintStream ps = new PrintStream(fos);
        ps.printf("%s@%s@%s@\n", this.star.substring(0, (this.star.indexOf(".") + 2)), this.name, this.review);

        ps.close();
        fos.close();
    }
}

