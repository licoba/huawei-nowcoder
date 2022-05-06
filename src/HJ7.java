import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// HJ7 取近似值
public class HJ7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] split = str.split("\\.");
        sb.append(split[0]);
        if (split[1].toCharArray()[0] < '5') {
            res = Integer.parseInt(sb.toString());
        } else {
            res = Integer.parseInt(sb.toString()) + 1;
        }
        System.out.println(res);
    }

}
