import java.util.Scanner;

public class EIUPH011 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // array of counts for numbers up to 1,000,000
        int[] check = new int[1000001];
        StringBuilder sb = new StringBuilder();
        // use for loop outputs to avoid multiple print calls
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            // read the number and check if it has been seen before then add in
            // StringBuilder if it is the first time
            int num = sc.nextInt();
            if (check[num] == 0) {
                sb.append(i + 1).append(" ");
            }
            check[num]++;
        }
        System.out.println(sb);
    }
}
