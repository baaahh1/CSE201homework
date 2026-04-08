import java.util.Arrays;
import java.util.Scanner;

public class EIKMAX {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length = sc.nextInt();
        int arrays[] = new int[length];
        int num = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int input = sc.nextInt();
            arrays[i] = input;
        }
        Arrays.sort(arrays);
        for (int i = length - 1; i >= length - num; i--) {
            sb.append(arrays[i]).append(" ");
        }
        System.out.println(sb);

    }
}
