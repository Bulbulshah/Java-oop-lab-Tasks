import java.util.*;

public class Q3_StackBooks {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Book A");
        books.push("Book B");
        books.push("Book C");
        books.push("Book D");
        books.push("Book E");

        String removed1 = books.pop();
        String removed2 = books.pop();

        System.out.println("Removed Books: " + removed1 + ", " + removed2);
        System.out.println("Remaining Stack: " + books);
    }
}
