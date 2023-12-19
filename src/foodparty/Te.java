package foodparty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Te {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("res/맥도날드");
        int reviewCount;

        Stream<Path> files = Files.list(path).filter(Files::isRegularFile);
        long fileCount = files.count();
        reviewCount = (int) fileCount;

        System.out.println("폴더에 있는 파일의 개수: " + fileCount);
    }
}
