import java.io.*;
import java.util.*;

public class HJ28 {
    // HJ28 素数伴侣
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            int count = Integer.parseInt(line);
            String[] elements = br.readLine().split(" ");
            int[] nums = new int[count];
            int oddCount = 0;
            int index = 0;
            for (String ele : elements) {
                nums[index] = Integer.parseInt(ele);
                if (nums[index] % 2 == 1) {
                    oddCount++;
                }
                index++;
            }
            int[] oddNums = new int[oddCount];
            int[] evenNums = new int[count - oddCount];
            int oddIndex = 0;
            int evenIndex = 0;
            for (int num : nums) {
                if (num % 2 == 0) {
                    evenNums[evenIndex++] = num;
                } else {
                    oddNums[oddIndex++] = num;
                }
            }
            int pairCount = 0;
            int[] evenPair = new int[evenIndex];
            for (int i = 0; i < oddIndex; i++) {
                boolean[] used = new boolean[evenIndex];
                if (findPair(i, oddNums, evenNums, evenPair, used)) {
                    pairCount++;
                }
            }
            System.out.println(pairCount);
        }
    }

    public static boolean findPair(int oddIndex, int[] oddNums, int[] evenNums, int[] evenPair, boolean[] used) {
        for (int i = 0; i < evenNums.length; i++) {
            if (!used[i] && isP(oddNums[oddIndex] + evenNums[i])) {
                used[i] = true;
                if (evenPair[i] == 0 || findPair(evenPair[i] - 1, oddNums, evenNums, evenPair, used)) {
                    evenPair[i] = oddIndex + 1;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isP(int num) {
        if (num <= 3) {
            return num > 1;
        }
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }

        double sqrt = Math.sqrt(num);
        for (int i = 5; i < sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}