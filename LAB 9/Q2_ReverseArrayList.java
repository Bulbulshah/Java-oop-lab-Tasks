import java.util.*;

public class Q2_ReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);

        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - i - 1));
            list.set(n - i - 1, temp);
        }

        System.out.println("Reversed List: " + list);
    }
}