import java.util.Scanner;
public class substring_ab_moore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int state = 0;
        for (int i = 0; i < str.length(); i++) {
            char input = str.charAt(i);

            switch (state) {
                case 0:
                    if (input == 'a') state = 1; 
                    else if (input == 'b') state = 0;
                    if (state == 0) System.out.print("0");
                    else if (state == 1) System.out.print("0");
                    else if (state == 2) System.out.print("1");
                    break;
                case 1:
                    if (input == 'a') state = 1; 
                    else if (input == 'b') state = 2;
                    if (state == 0) System.out.print("0");
                    else if (state == 1) System.out.print("0");
                    else if (state == 2) System.out.print("1");
                    break;
                case 2:
                    if (input == 'a') state = 1; 
                    else if (input == 'b') state = 0;
                    if (state == 0) System.out.print("0");
                    else if (state == 1) System.out.print("0");
                    else if (state == 2) System.out.print("1");
                    break;
            }
        }
        sc.close();
    }
}
