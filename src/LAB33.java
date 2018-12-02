public class LAB33 {
    public static void main(String[] args) {


        int year = 2009;
        System.out.println("********3.3.1********");
        System.out.println("Wszystkie daty " + year + " roku: ");
        int[] daysInMonth = new int [12];
        for (int i = 0; i < 12; i++) {
            daysInMonth[i] = DayCounter.countDays(i+1, year);
            //System.out.println(daysInMonth[i]);
            for (int j = 1; j < daysInMonth[i]+1;j++){
                System.out.println(j + "/" + (i+1) + "/" + year);
            }

        }

        System.out.println("********3.3.2********");
        String liczbaSlownie = "cztery";
        int a = convertToNum(liczbaSlownie);
        //System.out.println(a);
        if (args.length > 0) {
            System.out.println((long) convertToNum(args[0]));
        }
        else {
            System.out.println("Nie podano argumentów");

        }
        System.out.println("********3.3.3********");
        int i = 596; // dla 595 wystarczy pamięci
        long[][][] array = new long[i][i][i];


    }
    public static int convertToNum(String liczbaSlownie){
        int liczba = 0;

        switch(liczbaSlownie) {
            case "jeden":
                liczba = 1;
                break;
            case "dwa":
                liczba = 2;
                break;
            case "trzy":
                liczba = 3;
                break;
            case "cztery":
                liczba = 4;
                break;
            case "pięć":
                liczba = 5;
                break;
            case "sześć":
                liczba = 6;
                break;
            case "siedem":
                liczba = 7;
                break;
            case "osiem":
                liczba = 8;
                break;
            case "dziewięć":
                liczba = 9;
                break;
            case "dziesięć":
                liczba = 10;
                break;
            default:
                liczba = 0;
        }

        return liczba;
    }
}
