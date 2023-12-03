public class RectangleBai2 {
    public static void main(String[] args) {
        RectangleBai2 rectangle1 = new RectangleBai2();
        RectangleBai2 rectangle2 = new RectangleBai2(9,4);
        System.out.println("Rectangle5 : chieuDai : " + rectangle1.getChieuDai() + ",chieuRong : " + rectangle1.getChieuRong());
        System.out.println("Rectangle2 : chieuDai : " + rectangle2.getChieuDai() + ", chieuRong : " + rectangle2.getChieuRong());
    }
    public double chieuDai;
    public double chieuRong;
    public RectangleBai2() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }
    public RectangleBai2(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }
}
