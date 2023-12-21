package foodparty;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Te {
    public static void main(String[] args) throws IOException {
//        int[][] x = new int[3][4];
//
//        x[0][0] = 10;
//        x[0][1] = 20;
//        x[0][2] = 30;
//        x[0][3] = x[0][0] + x[0][1] + x[0][2];
//
//        x[1][0] = 40;
//        x[1][1] = 50;
//        x[1][2] = 60;
//        x[1][3] = x[1][0] + x[1][1] + x[1][2];
//
//        x[2][0] = x[0][0] + x[1][0];
//        x[2][1] = x[0][1] + x[1][1];
//        x[2][2] = x[0][2] + x[1][2];
//        x[2][3] = x[2][0] + x[2][1] + x[2][2];
//
//        for (int y = 0; y < x.length; y++) {
//            for (int z = 0; z < x[y].length; z++) {
//                System.out.printf("%d ",x[y][z]);
//            }
//            System.out.println();
//        }

        int storeNo = 2;
//        for (int i = 0; i < storeNo; i++) {
            // 디렉터리 목록을 가져옴
            Path path = Paths.get("res/store");
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path, (Path entry) -> Files.isDirectory(entry));

            // 디렉터리 목록을 순차적으로 탐색
            Path entry = directoryStream.iterator().next();
            // 디렉터리 이름을 출력
            System.out.println( ". " + entry.getFileName().toString());
//        }

//        int reviewCount = (int) fileCount-1;
//        System.out.println("리뷰카운트 "+reviewCount);
    }
}

