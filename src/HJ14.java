import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ14 {
    // HJ14 字符串排序
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        String[] result = new String[count];
        for (int i = 0; i < count; i++) result[i] = bf.readLine();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(result);
        for (String w : result) sb.append(w).append('\n');
        System.out.println(sb.toString());
    }
}
