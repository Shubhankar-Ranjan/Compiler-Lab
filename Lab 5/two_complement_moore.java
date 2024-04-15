import java.util.Scanner;

public class two_complement_moore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String reversedStr = reverseString(str);

        String ans = "";

        int state = 0;
        for (int i = 0; i < reversedStr.length(); i++) {
            char input = reversedStr.charAt(i);

            switch (state) {
                case 0:
                    if (input == '0') state = 0; 
                    else if (input == '1') state = 1;
                    if (state == 0) ans += "0";
                    else if (state == 1) ans += "1";
                    else if (state == 2) ans += "0";
                    break;
                case 1:
                    if (input == '0') state = 1; 
                    else if (input == '1') state = 2;
                    if (state == 0) ans += "0";
                    else if (state == 1) ans += "1";
                    else if (state == 2) ans += "0";
                    break;
                case 2:
                    if (input == '0') state = 1; 
                    else if (input == '1') state = 2;
                    if (state == 0) ans += "0";
                    else if (state == 1) ans += "1";
                    else if (state == 2) ans += "0";
                    break;
            }
        }
        System.out.println(reverseString(ans));
        sc.close();
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
    
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
    
            left++;
            right--;
        }
    
        return new String(charArray);
    }
}
