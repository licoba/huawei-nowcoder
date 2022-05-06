import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// HJ5 进制转换
public class HJ5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(Long.parseLong(line.substring(2), 16));
        }
    }
}
