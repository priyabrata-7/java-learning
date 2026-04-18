import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the n");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        max(arr);
        min(arr);


    }

    static void max(int[] arr) {
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        System.out.println(m);

    }

    static void min(int[] arr) {
        int mi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mi) {
                mi = arr[i];
            }
        }
        System.out.println(mi);


    }
}