package javaexample10simplecharqueue;

import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaExample10SimpleCharQueue {

    public static void main(String[] args) {

        InputStreamReader input = new InputStreamReader(System.in);

        System.out.print("Enter many characters: ");

        ArrayList<Character> myChars = new ArrayList<Character>(); // our queue
        char a;

        while (true) {
            try {
                a = (char) input.read(); // read() reads the first char in the first round. 
                // Then, it reads the second vhar in the second round.

                // Stop the loop when you find "enter" character
                if (a == '\n') {
                    break;
                }
                myChars.add(a);
            } catch (Exception e) {
                System.out.println(e.toString());
                break;
            }
        }// end while
        System.out.println("------");
        PrintCharArrayList(myChars);
    }//end main

    private static void PrintCharArrayList(ArrayList<Character> list) {
        for (int j = 0; j < list.size(); j++) {

            System.out.println(list.get(j));
        }
    } // end PrintCharArrayList

}
