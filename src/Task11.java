import java.util.Scanner;
public class Task11 {
    public static void task11() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers-2; i++)
            if (((num[i]) + (num[i + 2])) / 2 == num[i+1]) {
                System.out.println("Элементы, которые равны полусумме соседних элементов: " + num[i+1]);
            }
    }
}
