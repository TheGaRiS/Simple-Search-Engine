// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i;
        int count = -1;
        do {
            i = scn.nextInt();
            count++;
        }while (i != 0);
        System.out.println(count);
    }
}