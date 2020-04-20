package ques2;
import java.util.Scanner;

public class MyMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array...");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements...");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        DuplicateElement obj = new DuplicateElement();
        obj.duplicateElement(arr);
    }
}
