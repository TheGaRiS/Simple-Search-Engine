// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    final static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int length = scn.nextInt();
        int[] nums = new int[length];
        int maxp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = scn.nextInt();
            if (i > 0){
                if (nums[i]*nums[i-1]>maxp){
                    maxp = nums[i]*nums[i-1];
                }
            }
        }
        System.out.print(maxp);
    }
}