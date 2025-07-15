//Task 1
public class UniversityTester {
    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();
        System.out.println(u1);
        System.out.println(u2);
        if (u1==u2)
        {
            System.out.println("Same Location");
        }
        else
        {
            System.out.println("Different Location");
        }
        System.out.println("Initially:");
        System.out.println("University-1 Details:");
        System.out.println("Name- "+u1.name);
        System.out.println("Country- "+u1.country);
        System.out.println();
        System.out.println("University-2 Details:");
        System.out.println("Name- "+u2.name);
        System.out.println("Country- "+u2.country);
        System.out.println();
        u1.name = "Imperial College London";
        u1.country = "England";
        u2.name = "Brac University";
        u2.country = "Bangladesh";
        System.out.println("After Changing -");
        System.out.println("University-1 Details:");
        System.out.println("Name- "+u1.name);
        System.out.println("Country- "+u1.country);
        System.out.println();
        System.out.println("University-2 Details:");
        System.out.println("Name- "+u2.name);
        System.out.println("Country- "+u2.country);
        System.out.println();
        if (u1.name.equals(u2.name) && u1.country.equals(u2.country)) {
            System.out.println("Instance variables are of same value");
        } else {
            System.out.println("Instance variables are of different value");
        }

    }
}
