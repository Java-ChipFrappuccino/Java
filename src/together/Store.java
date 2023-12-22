package together;

public class Store {
    Review review;
//    static int staticStoreNo = 0;
    int number = 0;
    String category;
    String name;
    String star;
//    int reviewCount = 0; // 스토어에 리뷰갯수 저장?
//    Review review = new Review();
    public Store() {
        review = new Review();
    }

    public void setStar(double avgStar) {
        this.star = String.format("%.1f", avgStar);
    }
}
