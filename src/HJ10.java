import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HJ10 {
    // HJ10 字符个数统计
    public static void main(String[] args) throws Exception {
        BufferedReader shuru = new BufferedReader(new InputStreamReader(System.in));
        String s = shuru.readLine();
        int[] a = new int[128];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (a[b] == 0) {
                count++;
                a[b] = 1;
            }
        }
        System.out.println(count);
    }
}
