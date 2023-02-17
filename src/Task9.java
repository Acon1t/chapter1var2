import java.util.Scanner;
public class Task9 {
    public static void task9() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
                int q = num[i] % 10;
                int w = (num[i] / 10) % 10;
                int e = (num[i] / 100) % 10;
                int r = (num[i] / 1000) % 10;
                int t = (num[i] / 10000) % 10;
                int y = (num[i] / 100000) % 10;
                if ((y + t + r) == (e + w + q)) {
                    System.out.println("Lucky number:" + num[i]);
                }
            }
        }
    }

