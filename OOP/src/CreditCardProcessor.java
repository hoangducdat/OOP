public class CreditCardProcessor implements PaymentProcessor{
    String hoaqDucDat = new String("kich hoat the");
    String thanhToan = new String("xac nhan van tay");
    @Override
    public void authorize() {
        System.out.println("HDD : " + hoaqDucDat + " => the tin dung da duoc uy quyen");
    }
    @Override
    public void capture() {
        System.out.println("HDD : " + thanhToan + " => da thanh toan bang the tin dung");
    }
}
