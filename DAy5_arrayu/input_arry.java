package DAy5_arrayu;

import java.util.Scanner;

public class input_arry {
    public static void main(String[] args) {int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter array element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " = " + arr[i]);
        }

        sc.close();
    }
}