public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        int monthlyPayment = (int) service.calculate(1_000_000, 9.99, 12);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);

        int monthlyPayment2 = (int) service.calculate(1_000_000, 9.99, 24);
        System.out.println("Ежемесячный платеж: " + monthlyPayment2);

        int monthlyPayment3 = (int) service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платеж: " + monthlyPayment3);
    }
}
