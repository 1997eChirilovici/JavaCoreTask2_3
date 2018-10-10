package POOtask1.logic;

public class SavingAccount {
    private static double annualInterestRate;

    public SavingAccount() {
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public static void modifyInterestRate(double annualInterestRate){
        SavingAccount.annualInterestRate = annualInterestRate;
    }
}
