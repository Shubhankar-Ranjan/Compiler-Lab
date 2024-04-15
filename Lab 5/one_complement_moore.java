import java.util.Scanner;

public class one_complement_moore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int state = 0;
        for (int i = 0; i < str.length(); i++) {
            char input = str.charAt(i);

            switch (state) {
                case 0:
                    if (input == '1') state = 0; 
                    else if (input == '0') state = 1;
                    if (state == 0) System.out.print("0");
                    else if (state == 1) System.out.print("1");
                    break;
                case 1:
                    if (input == '1') state = 0; 
                    else if (input == '0') state = 1;
                    if (state == 0) System.out.print("0");
                    else if (state == 1) System.out.print("1");
                    break;
            }
        }
        sc.close();
    }
}