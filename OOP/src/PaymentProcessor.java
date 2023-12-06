public interface PaymentProcessor {
    void authorize();

    void capture();
}
class PaymentService {
    void processPayment(PaymentProcessor processor) {
        processor.authorize();
        processor.capture();
    }
}
