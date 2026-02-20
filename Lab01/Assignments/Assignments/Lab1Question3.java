import java.util.Scanner;

public class Lab1Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean[] flag = new boolean[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (flag[i]) {
                continue;
            }

            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    flag[j] = true;
                }

            }

            System.out.println(arr[i] + " - " + count);
            count = 0;
        }

    }
}
