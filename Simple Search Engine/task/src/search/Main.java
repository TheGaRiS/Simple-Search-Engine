package search;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    final static Main m = new Main();
    Scanner scn = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList <String> arr = new ArrayList<>();
    String pathToFile = "data.txt";
    static String newPathToFile;
    public static void main(String[] args) throws IOException {
        if (args[0] == "--data") {
            newPathToFile = args[1];
        }
        m.input();
    }
    public void input() throws IOException {
        if (!newPathToFile.isEmpty()){
            pathToFile = newPathToFile;
        }
        File file = new File(pathToFile);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                arr.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nNo file found: " + pathToFile);
        } finally {
            file.delete();
        }
         menu();
    }
    public void search() throws IOException {
        ArrayList <String> found = new ArrayList<>();
        String sData;
        int foundNum = 0;
            System.out.println("\nEnter data to search:");
            sData = (br.readLine()).toLowerCase();
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j).toLowerCase().contains(sData))
                    found.add(arr.get(j));
                    foundNum++;
                }
            
            if (foundNum > 0){
//                System.out.println("Found:");
                for (int j = 0; j < found.size(); j++){
                    System.out.println(found.get(j));
                }
                found.clear();
            }
            else {
                System.out.println("\nNothing is found");
            }
        menu();
    }
    public void printAll() throws IOException{
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        menu();
    }

    public void exit() {
        System.out.println("\nBye!");
    }

    public void wrongEntry() throws IOException {
        System.out.println("\nWrong entry!");
        menu();
    }

    public void menu() throws IOException {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Find a person");
        System.out.println("2. Print all people");
        System.out.println("0. Exit");
        int choice = scn.nextInt();
        switch (choice){
            case 0: {
                exit();
                break;
            } case 1: {
                search();
                break;
            } case 2: {
                printAll();
                break;
            } default: {
                wrongEntry();
                break;
            }
        }
    }
}
