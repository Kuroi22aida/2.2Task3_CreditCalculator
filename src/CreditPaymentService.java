public class CreditPaymentService {
    public double calculate(int amount, double percent, int term) {

        double monthlyInterestRate = percent / 12 / 100;
        double annuityRatio = ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, term)) / (Math.pow(1 + monthlyInterestRate, term) - 1));
        int monthlyPayment = (int) (amount * annuityRatio);
        return monthlyPayment;
    }
}

