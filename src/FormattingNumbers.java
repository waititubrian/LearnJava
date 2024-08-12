import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        String result4 = NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(result4);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);

       String result3 =  NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);

    }
}
