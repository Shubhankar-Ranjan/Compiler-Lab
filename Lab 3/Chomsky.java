import java.util.Scanner;

public class Chomsky {

    public static String chomsky(String str) {
        String[] parts = str.split("-");
        String ans = "";
        
        if(parts[0].length() >= 1){
            boolean flag = false;
            for(char c : parts[0].toCharArray()) {
                if(c >= 'A' && c <= 'Z') {
                    flag = true; 
                    break;
                }
            }
            ans = flag ? "Type 0" : "Not a Grammar";        
        } else {
            ans = "Not a Grammar";
        }

        if(ans == "Type 0" && (parts[0].length() <= parts[1].length())) {
            ans = "Type 1";
        }

        if(ans == "Type 1" && parts[0].length() == 1) {
            ans = "Type 2";
        }

        if(ans == "Type 2" && (parts[1].charAt(0) >= 'a' && parts[1].charAt(0) <= 'z')){
            boolean flag = true;
            for(int i = 1; i < parts[1].length(); i++) {
                if(parts[1].charAt(i) >= 'a' && parts[1].charAt(i) <= 'z') {
                    flag = false;
                    break;
                }
            }
            if(flag) ans="Type 3" ;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the String: ");
            String str = sc.nextLine();

            String ans = chomsky(str);
            System.out.println(ans);

            System.out.println("Do you want to continue? (y/n)");
            String ch = sc.nextLine();
            if(ch.toLowerCase().equals("n")) break;
        } while(true);

        sc.close();
    }
}