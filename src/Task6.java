import java.util.Scanner;
public class Task6 {
    public static void task6() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            int m=1;
            for(int k=3;k*k<=num[i];k+=2) {
                if(num[i]%k==0)
                    m=0;
            }
            if (num[i]%2!=0 && m!=0) {
                System.out.println("Unique number:" + num[i]);
            }
        }
    }
}

