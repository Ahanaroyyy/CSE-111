//Task 8
public class Player {
    public static int total;
    public static String[] arr = new String[10];

    private String name;
    private String country;
    public int jersey;

    public Player(String a, String b, int c) {
        if (total < 11) {
            name = a;
            country = b;
            jersey = c;
            arr[total] = name;
            total++;
        }
    }

    public String player_detail() {
        return "Player Name: " + name + "\nJersey Number: " + jersey + "\nCountry: " + country;
    }

    public static void info() {
        System.out.println("Total numbers of players: " + total);
        System.out.print("Players enlisted so far: ");
        for (int i = 0; i < total; i++) {
            if (i == total - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }
}