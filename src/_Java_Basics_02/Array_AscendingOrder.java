package _Java_Basics_02;
import java.util.Arrays;
import java.util.Scanner;

public class Array_AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         Arrays.sort(arr);

        System.out.println("Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
