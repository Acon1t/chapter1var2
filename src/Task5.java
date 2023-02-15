import java.util.Scanner;
public class Task5 {
    public static void task5() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            int k=num[i]/100;
            int m=num[i]/10-k*10;
            if (k!= m && m!=num[i]%10) {
                System.out.println("Unique number:" + num[i]);
            }
        }
    }
}
