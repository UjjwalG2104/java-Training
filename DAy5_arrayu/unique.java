package DAy5_arrayu;

public class unique {
    public static void main(String[] args) {

        int arr[] = {5, 9, 47, 9, 11};

        System.out.println("Unique Elements:");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}