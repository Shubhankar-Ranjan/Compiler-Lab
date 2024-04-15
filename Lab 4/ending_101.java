import java.util.Scanner;

public class ending_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary string: ");
        String str = sc.nextLine();

        int state = 0;
        for (int i = 0; i < str.length(); i++) {
            char input = str.charAt(i);

            switch (state) {
                case 0:
                    if (input == '1') state = 1;
                    else if (input == '0') state = 0;
                    break;
                case 1:
                    if (input == '1') state = 1;
                    else if (input == '0') state = 2;
                    break;
                case 2:
                    if (input == '1') state = 3;
                    else if (input == '0') state = 0;
                    break;
                case 3:
                    if (input == '1') state = 1;
                    else if (input == '0') state = 2;
                    break;
            }
        }

        if (state == 3) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}
