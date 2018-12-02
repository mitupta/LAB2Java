public class EqualsTester {

    public static void main(String[] args) {

        String str1, str2;

        str1 = "raz dwa trzy";
        str2 = new String("raz dwa trzy");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("ten sam obiekt? " + (str1==str2));  // porownanie czy to są te same OBIEKTY!!!
        System.out.println("czy zawartość jest identyczna? " + (str1.equals(str2))); // porownywanie czy te obiekty mają takie same wartosci


        String name = "Tomek";

        System.out.println(name.getClass().getName());
        System.out.println(name.getClass().getSimpleName());

        System.out.println(name instanceof String);

        System.out.println(name instanceof Object);

        Object object = new Object();
        object = name;

        System.out.println(object instanceof Integer);



    }


}
