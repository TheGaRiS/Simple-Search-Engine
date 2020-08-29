import java.util.Scanner;

class Main {
    static Scanner scn = new Scanner(System.in);
    static String s;
    static int i;
    public static void main(String[] args) {
        while (true) {
            s = scn.nextLine();
            if ("0".equals(s)) {
                break;
            }
            try {
                i = parse(s);

                System.out.println(i);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + s);
            }

        }
    }
    public static int parse(String s) {
        return Integer.parseInt(s) * 10;
    }
}