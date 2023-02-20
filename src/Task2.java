import java.util.Scanner;

public class Task2 {
    public static void task2() {
        int min=150;
        int max=0;
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++){
            if (num[i] < min) {
                min=num[i];
            }
            else if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Minimum number:" + min);
        System.out.println("Maximum number:" + max);
    }
    }

