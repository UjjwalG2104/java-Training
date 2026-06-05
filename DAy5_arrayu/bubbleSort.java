package DAy5_arrayu;

public class bubbleSort {



    static void BubbleSort(int arr[]) {

      for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
      }
    }
    public static void main(String[] args) {
        
        int arr[] = {5, 9, 47, 9, 11};
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        BubbleSort(arr);
    }
}
