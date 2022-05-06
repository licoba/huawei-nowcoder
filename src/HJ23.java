import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ23 {
    // HJ23 删除字符串中出现次数最少的字符
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        while (s != null && s.length() != 0) {
            System.out.println(updateString(s));
            s = br.readLine();
        }
    }

    public static String updateString(String s) {
        char[] charArray = s.toCharArray();
        int[] count = new int[26];
        for (char c : charArray) {
            count[c - 'a']++;

        }
        int min = 20;
        for (int i : count) {
            if (i > 0 && i < min) min = i;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (count[c - 'a'] != min) sb.append(c);
        }
        return sb.toString();


    }
}
