import java.util.Scanner;
public class Task10 {
    public static void task10() {
        System.out.println("Enter name and press <Enter> & number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        StringBuffer t = new StringBuffer(s);
        t.reverse();
        String r = t.toString();
        if (s.equals(r)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}