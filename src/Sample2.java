public class Sample2 {
    public static void main(String[] args) {

        int a = 10;


        if (a<0) {
            System.out.println(a + " jest mniejsze od 0");
        } else if (a>0) {
            System.out.println(a+ " jest większe od 0");
        } else {
            System.out.println(a + " jest równe 0");
        }


        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale!");
                break;
            case 'B':
                System.out.println("Dobrze!");
                break;
            case 'C':
                System.out.println("Mogło być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");


        }

        boolean isOk = false;

        do {
            System.out.println("JEST OK");
        } while (isOk);

        System.out.println("Nie jest dobrze!");


        int[] arr = {2,3,4,2,5,65,2,5};
        for (int i : arr ) {
            System.out.println(i);
        }


        for (int i : arr ) {
            System.out.println("zatrzymane" + i);
            break;
        }
    }
}
