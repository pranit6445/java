import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of levels");
        int n = sc.nextInt();
        int[] levels = new int[n];

        System.out.print("enter the levels");
        for (int i = 0; i < n; i++) {
            levels[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int prev = levels[i];
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (levels[j] > prev) {
                    count++;
                    prev = levels[j];
                }
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println("Maximum points: " + max);
    }
}
