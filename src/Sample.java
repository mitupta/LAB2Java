public class Sample {
    public static void main(String[] args) {

        byte a = 7; // typy prymitywne
        short b;
        int c;

        c=a; // konwesja niejawna

        b = (short)c; // konwersja jawna = rzutowanie


        int d =  5;
        double e = 13.5;
        double f = e/d;

        int g = (int) e/d;


        Employee emp = new Employee();
        VicePresident vp = new VicePresident();

        emp = vp;

        vp = (VicePresident) emp;

        //boxing i unboxing

        Float ft1 = 12.5F;
        Float ft2 = 2.2F;

        Math.min(ft1,ft2); // skonwerowało obiekt na typ prymitywny automatycznie



    }
}

class Employee{}
class VicePresident extends Employee {};
