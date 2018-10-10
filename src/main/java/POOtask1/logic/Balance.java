package POOtask1.logic;


public class Balance  implements MonthlyInterest {
    private double savingBalance;

    public Balance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }


    public double calculateMonthlyInterest(SavingAccount annualInterestRate, Balance balance) {
        return (annualInterestRate.getAnnualInterestRate() * balance.getSavingBalance()) /12;
    }

    public void addAtBalance(double sum){
        this.savingBalance+=sum;
    }
}
