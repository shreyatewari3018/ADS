import java.util.*;

public class DefuseBomb {
    public static void main(String[] args) {
        // Problem Number:1652(Defuse the bomb.)
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] code = new int[n];
            for (int i = 0; i < n; i++) {
                code[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int[] result = decrypt(code, k);
            System.out.println(Arrays.toString(result));
        } finally {
            sc.close(); // Close the scanner after use
        }
    }

    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        // If k is 0, return an array with all zeros.
        if (k == 0) {
            return result;
        }

        // Determine the step direction based on the value of k
        int step = (k > 0) ? 1 : -1;
        int limit = Math.abs(k);  // Use absolute value of k to determine the loop range

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= limit; j++) {
                int index = (i + j * step + n) % n;  // Handle circular indexing
                sum += code[index];
            }
            result[i] = sum;
        }

        return result;
    }
}
