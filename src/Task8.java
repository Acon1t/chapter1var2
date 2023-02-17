import java.util.Scanner;
import java.util.List;
import java.util.Map.Entry;

public class Task8 {;
    public static void task8() {
        System.out.println("Enter number and press <Enter>:");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        Integer[] num = new Integer[numbers];
        for (int i = 0; i < numbers; i++) {
            num[i] = scan.nextInt();
        }
        int[] counters = new int [ numbers];
        for ( int i = 0; i < numbers; ++i ) {
            counters[i] = 0;

            for ( int j = 0; j < numbers; ++j )
                if ( num[i] == num[j] )
                    counters[i] += 1;
        }
        for ( int i = 0; i < numbers - 1; ++i ) {
            for ( int j = i + 1; j < numbers; ++j ) {
                if ( counters[j] > counters[i] ) {
                    int tmp = counters[i];
                    counters[i] = counters[j];
                    counters[j] = tmp;
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
                else if ( counters[i] == counters[j] && num[i] > num[j] ) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }

        System.out.println("\\\\\\\\\\");
        for ( int i = 0; i < numbers; i += counters[i] )
            System.out.println(num[i] + "\t" + counters[i]);
    }
}



