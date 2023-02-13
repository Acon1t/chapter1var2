import java.util.Scanner;
public class Task3 {
    public static void task3() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            if (num[i] % 3 != 0 || num[i] % 9 != 0) {
                System.out.println("Numbers divisible by 3 or 9:" + num[i]);
            }
        }
    }
}