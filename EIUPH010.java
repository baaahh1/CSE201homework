import java.util.*;

public class EIUPH010 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrays = new int[1000001];
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            int num = sc.nextInt();
            arrays[num]++;
        }
        int frequency = 1;
        int minNum = 1000000;
        int tempFreq = 0;
        int tempMin = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > frequency) {
                tempFreq = arrays[i];
                tempMin = i;
            } else if (arrays[i] == frequency && arrays[i] != 0) {
                minNum = Math.min(minNum, i);
            }
        }
        System.out.println(minNum + " " + frequency);
    }
}
