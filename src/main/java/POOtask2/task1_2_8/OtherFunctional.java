package task1_2_8;

import java.text.DecimalFormat;

public class OtherFunctional {
    public String twoDigit(double number){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(number);
    }
}
