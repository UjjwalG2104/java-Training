package Day8;

public class AvgSlidingWindow { 
    static void avgInWindow(int arr[], int k) {
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            double avg = (double) sum / k;
            System.out.print(avg + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        avgInWindow(arr, k);
    }

    
    
}
