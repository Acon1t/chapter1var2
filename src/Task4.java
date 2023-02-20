import java.util.Scanner;
public class Task4 {
    public static void task4() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            if ((num[i] % 5 == 0) && (num[i] % 7 == 0)) {
                System.out.println("Numbers divisible by 5 and 7:" + num[i]);
            }
        }
    }
}