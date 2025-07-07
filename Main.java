import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number of scores: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the  scores: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        Arrays.sort(arr);

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (arr[i] != prev) {
                count++;
                prev = arr[i];
                if (count == k) {
                    System.out.println("The " + k + "-th largest unique element is: " + arr[i]);
                    return;
                }
            }
       }
        System.out.println("-1");
    }
}
