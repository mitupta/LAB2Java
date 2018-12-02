import java.util.StringTokenizer;

public class LAB32 {
    public static void main(String[] args) {
        String data = "02/12/2018";

        StringTokenizer st;

        st = new StringTokenizer(data, "/");
        System.out.println("**********3.2.1**********");
        showData(st,data);


        System.out.println("**********3.2.2**********");
        Egzemplarz egzemplarz = new Egzemplarz();
        egzemplarz.height = 180;
        egzemplarz.weight = 81;
        egzemplarz.depth = 33;
        showEgzemplarzValues(egzemplarz);

        System.out.println("**********3.2.3**********");
        Count ct1 = new Count();
        Count ct2 = new Count();
        //Count ct3 = new Count();

        int a = Count.GetInstancesNum();

        System.out.println("Ilość instancji klasy = " + a);



    }
    static void showData(StringTokenizer st, String data){
        System.out.println("Data: " + data);
        System.out.println("Dzień: " + st.nextToken());
        System.out.println("Miesiąc: " + st.nextToken());
        System.out.println("Rok: " + st.nextToken());
    }

    static void showEgzemplarzValues(Egzemplarz egzemplarz){
        System.out.println("Dane egzemplarza: \nWeight: " + egzemplarz.weight +"\nHeight: " + egzemplarz.height + "\nDepth: " + egzemplarz.depth);
    }
}

class Egzemplarz{
    int height, weight, depth;
}

class Count{

    private static int counter;

    public Count(){
        counter++;
    }

    public static int GetInstancesNum(){
        return counter;
    }

}

