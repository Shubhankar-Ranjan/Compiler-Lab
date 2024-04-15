import java.util.Scanner;
import java.util.Stack;

public class pda_anbn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        String state = "q0";

        int i = 0;
        while (i < str.length()) {
            if (state.equals("q0") && str.charAt(i) == 'a') {
                stack.push(str.charAt(i));
                i++;
            } else if (state.equals("q0") && str.charAt(i) == 'b') {
                state = "q1";
            } else if (state.equals("q1") && str.charAt(i) == 'b') {
                if (stack.isEmpty()) {
                    break;
                }
                stack.pop();
                i++;
            } else {
                break;
            }
        }

        if (i == str.length() && stack.isEmpty()) {
            System.out.println("The string is in the language.");
        } else {
            System.out.println("The string is not in the language.");
        }
    }
}