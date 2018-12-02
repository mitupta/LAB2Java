import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {

        int accountBalance = 15_005;
        System.out.printf("Saldo : %,d zł %n", accountBalance);

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.6f %n", pi);
        System.out.printf(new Locale("us"),"%.6f %n", pi);
    }
}
