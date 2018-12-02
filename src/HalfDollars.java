public class HalfDollars {
    public static void main(String[] args) {
        int [] denver = {1_700_000, 4_600_000, 2_100_000};
        int [] philadelphia = {1_800_000, 5_000_000, 1_800_000};
        int [] total = new int [denver.length];
        int suma = 0;

        for (int i = 0; i <  3; i++) {
            System.out.print("Produkcja w " + (2012 + i) + " roku wynosiła: ");
            System.out.format("%,d%n",total[i]);
            total[i] = denver[i]+philadelphia[i];
            suma += total[i];
        }

        System.out.print("ś".toUpperCase() + "rednia produkcja wynosiła: ");
        System.out.format("%,d%n",suma/3);


        //TABLICE WIELOWYMIAROWE

        int [][][] arr3D = new int [10][10][10];

        arr3D[0] = new int [10][0];



    }
}
