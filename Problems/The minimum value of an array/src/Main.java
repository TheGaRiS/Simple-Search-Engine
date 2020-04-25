// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int[] nums = new int[length];
        int min;
        for(int i = 0;i<nums.length;i++){
            nums[i] = scn.nextInt();
        }
        min = nums[0];
        for(int i = 0;i<nums.length;i++){
            if (min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}