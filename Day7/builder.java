package Day7;
//provide a mutable sequence of characters, which can be modified without creating a new object. It is more efficient than using String when you need to perform multiple modifications on a string, such as appending, inserting, or deleting characters. StringBuilder is not synchronized, which means it is not thread-safe but offers better performance in single-threaded scenarios.
public class builder {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());
    }
}
