package ques1;

public class OccuranceOfNumber {
    public static void findOccurance(int[] arr, int a) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println("Fount at index" + i);
                counter += 1;
            }
        }
        if (counter == 0) {
            System.out.println("not found");
        }
    }
}

