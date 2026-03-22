import java.util.Scanner;

public class Task8 {

    public static boolean onlyDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return onlyDigits(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(onlyDigits(s, 0) ? "Yes" : "No");
    }
}