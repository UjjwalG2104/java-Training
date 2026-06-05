package DAy5_arrayu;
public class enhance_for_loop {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };

        for (String name : names) {
            System.out.println(name);
        }
        int arr[] = { 5, 9, 47, 9, 11 };

        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest element in the array is: " + largest);
    }
}
