import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Task7 {
    public static void task7() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        Integer[] num = new Integer[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        for (int values : num) {
            System.out.print(values + ", ");
        }
        System.out.print("\\\\");
        Arrays.sort(num, Collections.reverseOrder());
        for (int values : num) {
            System.out.print(values + ", ");
        }

    }
}