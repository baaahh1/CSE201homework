import java.util.Arrays;
import java.util.Scanner;

public class EIUONCE {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testcase = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < testcase; t++) {
            int[] arrays = new int[sc.nextInt()];
            // Separate number for each condition, the first number in array, last number in
            // array, and the middle numbers in array
            // if its different then print if its not then skip
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = sc.nextInt();
            }
            Arrays.sort(arrays); // sort the array to find duplicates easier
            if (arrays[0] != arrays[1]) {
                sb.append(arrays[0]).append(" ");
            }
            for (int i = 1; i < arrays.length - 1; i++) {
                if (arrays[i] != arrays[i - 1] && arrays[i] != arrays[i + 1]) {
                    sb.append(arrays[i]).append(" ");
                }
            }
            if (arrays[arrays.length - 1] != arrays[arrays.length - 2]) {
                sb.append(arrays[arrays.length - 1]).append(" ");
            }
            System.out.println(sb);
            sb.setLength(0); // clear the StringBuilder for each test case

        }
    }
}
