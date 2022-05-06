import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ17 {
    // HJ17 坐标移动
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int x = 0;
            int y = 0;
            String[] strs = input.split(";");
            for (String str : strs) {
                int v = 0;
                if ("".equals(str) || str.length() > 3) continue;
                for (int i = 1; i < str.length(); i++) {
                    int t = str.charAt(i) - '0';
                    if (t >= 0 && t <= 9) {
                        if (i == 1 && str.length() != 2) v += t * 10;
                        else v += t;
                    } else {
                        v = 0;
                        break;
                    }
                }
                char c = str.charAt(0);
                switch (c) {
                    case 'A':
                        x -= v;
                        break;
                    case 'D':
                        x += v;
                        break;
                    case 'W':
                        y += v;
                        break;
                    case 'S':
                        y -= v;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
