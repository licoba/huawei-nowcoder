import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HJ22 {
    // HJ22 汽水瓶
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null) {
            int g = 0;
            g = Integer.parseInt(str);

            if (g == 0) {
                return;
            }
            int count = 0;
            while (g != 0) {
                int f = g / 3;
                count += f;
                g = g % 3 + f;

                if (g < 3) {
                    break;
                }
            }
            if (g == 2) {
                count += 1;
            }
            System.out.println(count);
        }
    }
}
