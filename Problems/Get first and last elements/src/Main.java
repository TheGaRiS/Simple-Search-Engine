// Posted from EduTools plugin
import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int[] arr){
        int[] farr = new int[2];
        farr[0] = arr[0];
        farr[1] = arr[arr.length-1];
        return farr;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}