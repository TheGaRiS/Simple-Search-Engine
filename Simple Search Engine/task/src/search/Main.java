package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    final static Main m = new Main();
    Scanner scn = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList <String> arr = new ArrayList<>();
    int num;
    public static void main(String[] args) throws IOException {
        m.input();
    }
    public void input() throws IOException {
        System.out.println("Enter number of entries:");
         num = scn.nextInt();
        System.out.println("Entry all of entries:");
         for (int i = 0; i < num; i++){
             arr.add(i,br.readLine());
         }
         search();
    }
    public void search() throws IOException {
        System.out.println("Entry the number of search queries:");
        ArrayList <String> found = new ArrayList<>();
        String sdata;
        int foundnum = 0;
        int que = scn.nextInt();
        for (int i = 0; i < que; i++){
            System.out.println("Enter data to search:");
            sdata = (br.readLine()).toLowerCase();
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j).contains(sdata)){
                    found.add(arr.get(j));
                    foundnum++;
                }
            }
            if (foundnum > 0){
                System.out.println("Found:");
                for (int j = 0; j < found.size(); j++){
                    System.out.println(found.get(j));
                }
                found.clear();
                foundnum = 0;
            }
            else {
                System.out.println("Nothing is found");
            }

        }
    }
}
