package DAy5_arrayu;

public class binarysearch {



    static int binarySearch(int arr[], int key) {

        int s=0;
        int e = arr.length-1;

        while(s<=e){
            int mid = (s+e)/2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                s = mid - 1;
            }
            else {
                e = mid + 1;
            }

        }
        return -1;
    }
            
    public static void main(String[] args) {


        int arr[] = {5, 9, 47, 9, 11};

        int key = 9;

        int index = binarySearch(arr, key);

        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
        
    }
    
}
