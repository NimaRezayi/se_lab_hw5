import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        //temp();
        eval(i, j, k);
        int n = 20000, as = 63689, b = 12345, mod=1003;
        int[] a = new int[n];
        a[0] = 2;
        for (int l = 1; l < n; l++)
            a[l] = (as*a[l-1]+b)%mod;
        System.out.println(countDuplicatesBruteForce(a));
    }
    public static void eval(int i, int j, int k)
    {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k)
        {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }
    public static void temp() {
        int[] a = new int[10000*20000];
        int idx = 0;
        for (int i = 0; i < 10000; i++)
        {
            for (int j = 0; j < 20000; j++) {
                a[idx] = i+j;
                idx++;
            }
        }
    }
    public static int countDuplicatesBruteForce(int[] numbers) { // new inefficient code
        int dup = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    dup++;
                }
            }
        }
        return dup;
    }
}