package POOtask1;
import POOtask1.logic.Balance;
import POOtask1.logic.SavingAccount;
import org.junit.Test;

public class TestFunctionalities {
    @Test
    public static void main(String[] args) {
        Balance saver1 = new Balance(2000);
        Balance saver2 = new Balance(3000);
        SavingAccount savingAccount = new SavingAccount();

        savingAccount.setAnnualInterestRate(0.04);
        double benefitMonthlySaver1 = saver1.calculateMonthlyInterest(savingAccount,saver1);
        saver1.addAtBalance(benefitMonthlySaver1);
        new LessFunctionally().showBalanceWithMonthlyBalance(saver1,"Ion");

        savingAccount.modifyInterestRate(0.06);
        double benefitMonthlySaver2 = saver1.calculateMonthlyInterest(savingAccount,saver1);
        saver2.addAtBalance(benefitMonthlySaver2);
        new LessFunctionally().showBalanceWithMonthlyBalance(saver2,"Cristi");
    }

}
