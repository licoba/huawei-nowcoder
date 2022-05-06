import java.io.BufferedReader;
import java.io.InputStreamReader;

// HJ6 质数因子
public class HJ06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sBuilder.append(i).append(" ");
                num = num / i;
                i--;
            }
        }
        sBuilder.append(num).append(" ");
        System.out.println(sBuilder.toString());
    }
}
