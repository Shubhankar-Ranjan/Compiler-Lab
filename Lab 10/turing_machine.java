// design a turing machine for m + n where m and n are unary numbers

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class turing_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String input = sc.nextLine();
        ArrayList<Character> arr = new ArrayList<Character>();
        arr.addAll(Collections.nCopies(30, 'A'));

        int middleIndex = arr.size() / 2 - input.length() / 2;
        int i = middleIndex;

        for (char c : input.toCharArray()) {
            arr.set(middleIndex++, c);
        }

        System.out.println("Before addition: " + arr);

        int state = 0;
        while(true) {
            if(state == 0 && arr.get(i) == '1') {
                arr.set(i, 'A');
                i++;
                state = 1;
            }
            else if(state == 1 && arr.get(i) == '1') {
                i++;
            }
            else if(state == 1 && arr.get(i) == '+') {
                i++;
                state = 2;
            }
            else if(state == 2 && arr.get(i) == '1') {
                i++;
            }
            else if(state == 2 && arr.get(i) == 'A') {
                arr.set(i, '1');
                i--;
                state = 3;
            }
            else if(state == 3 && arr.get(i) == '1') {
                i--;
            }
            else if(state == 3 && arr.get(i) == '+') {
                i--;
                state = 4;
            }
            else if(state == 4 && arr.get(i) == '1') {
                i--;
            }
            else if(state == 4 && arr.get(i) == 'A') {
                i++;
                state = 0;
            }
            else if(state == 0 && arr.get(i) == '+') {
                arr.set(i, 'A');
                break;
            }
        }

        System.out.println("After addition: " + arr);
    }
}