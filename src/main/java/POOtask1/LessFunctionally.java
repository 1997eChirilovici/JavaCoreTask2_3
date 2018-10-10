package POOtask1;
import POOtask1.logic.Balance;
import java.text.DecimalFormat;

public class LessFunctionally {
    public void showBalanceWithMonthlyBalance(Balance balance, String string){
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Balance with monthly balance for " +string+": "+ df.format( balance.getSavingBalance()));
    }
}
