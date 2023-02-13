import java.util.Scanner;
public class Task1 {
    public static void task1() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("Odd number:" + num[i]);
            }
            else if (num[i] % 2 == 0) {
                System.out.println("Even number:" + num[i]);
            }
        }
    }
}

