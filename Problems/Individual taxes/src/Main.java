// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        float[] income = new float[n];
        float[] taxes = new float[n];
        int num = 1;
        for (int i = 0 ; i < n ; i++){
            income[i] = scn.nextInt();
        }
        float info1;
        float info2;
        for (int i = 0 ; i < n ; i++){
            taxes[i] = scn.nextInt();
            if (i > 0){
                info1 =((income[i]/100)*taxes[i]);
                info2 =((income[i-1]/100)*taxes[i-1]);
                if (info1>info2){
                    num = i + 1;
                }
            }
        }
        System.out.println(num);
    }
}