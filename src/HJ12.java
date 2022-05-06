import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ12 {
    // HJ12 字符串反转
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String string = bf.readLine();
        System.out.println(new StringBuffer(string).reverse());
    }
}
