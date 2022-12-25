package loops;
import java.util.*;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println(i * n);
            i++;

        } while (i < 11);

    }
}