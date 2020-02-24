public class SavingsAccount{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balanceSavings){
    	this.savingsBalance = balanceSavings;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public double calculateMonthlyInterest(){
        double monthIntrst = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance = this.savingsBalance + monthIntrst;
        return monthIntrst;
    }

    public static void modifyInterestRate(double intrstRate){
        annualInterestRate = intrstRate / 100;
    }

}