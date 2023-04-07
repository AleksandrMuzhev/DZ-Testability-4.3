public class CreditPaymentService {
    public int creditPayment(double sum, double percent, double time) {
        double result;
        double rate; //ставка по кредиту в месяц
        double ratio; //коэффициент аннуитента
        double M = 12; //количество месяцев в году
        rate = percent / 100 / M;
        ratio = (rate * Math.pow((1 + rate), time)) / (Math.pow((1 + rate), time) - 1);
        result = ratio * sum;
        return (int) result;
    }
}
