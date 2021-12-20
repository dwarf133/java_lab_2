package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Input{
    static final String PATH = "text.txt";

    static String Read(){
        FileInputStream fis;
        try {
            fis = new FileInputStream(PATH);
        }
        catch (Exception ex){
            ex.printStackTrace();
            return "Pishov ti v sraku";
        }
        Scanner sc = new Scanner(fis);
        String ans = "";
        StringBuilder sb = new StringBuilder();
        while (true) {
                String s = "";
                try {
                    s = sc.nextLine();
                }
                catch (Exception ex){
                    s = "END";
                    break;
                }
                sb.append(s).append("\n");
            }
        ans = sb.toString();
        return ans;
    }

}

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        System.out.println(Input.Read());
    }
}
