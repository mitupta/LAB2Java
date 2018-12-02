public class StaticMember  {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name = "Piotr";
        dad.age = 32;
        FamilyMember mam = new FamilyMember();
        mam.name = "Anna";
        mam.age = 31;
        FamilyMember kid = new FamilyMember();
        kid.name = "Zosia";
        kid.age = 3;

        show(mam);
        show(dad);
        show(kid);


    }

    static void show(FamilyMember familyMember){
        System.out.print(familyMember.name);
        System.out.print(" ");
        System.out.print(familyMember.surname);
        System.out.print(", ");
        System.out.print(familyMember.age);
        System.out.print(" lat/a.\n");
    }
}

class FamilyMember{

    static String surname = "Nowak";
    String name;
    int age;
}
