public class SavingsAccountTest {
    public static void main(String[] args){
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000);
        saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);
        System.out.println("Month \tSaver1\t\tSaver2");
        
        for(int i = 1; i <= 12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            // to print upto 2 decimal places
            System.out.printf("%5d \t $%.2f \t $%.2f\n", i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }
        
        SavingsAccount.modifyInterestRate(5);
                saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nNew Balances: \n");
        System.out.printf("Saver 1:$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2:$%.2f\n", saver2.getSavingsBalance());
    }
}