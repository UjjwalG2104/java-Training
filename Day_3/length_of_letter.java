package Day_3;

public class length_of_letter {
    public static void main(String[] args) {
        
        int input = 452178;

        int count = 0;

        while(input!=0){
            count++;
            input = input / 10;
        }
        System.out.println("Length of the number: " + count);
    }
}
