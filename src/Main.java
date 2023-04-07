public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("При заявленной сумме кредита 1_000_000 рублей сроком на 1 год, платеж в месяц составит:");
        System.out.println(service.creditPayment(1_000_000, 9.99, 12));

        System.out.println();
        System.out.println("При заявленной сумме кредита 1_000_000 рублей сроком на 2 год, платеж в месяц составит:");
        System.out.println(service.creditPayment(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("При заявленной сумме кредита 1_000_000 рублей сроком на 3 года, платеж в месяц составит:");
        System.out.println(service.creditPayment(1_000_000, 9.99, 36));
    }
}