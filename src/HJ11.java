import java.io.IOException;
import java.io.InputStream;

public class HJ11 {
    // HJ11 数字颠倒
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int available = is.available() - 1;
        char[] arr = new char[available];
        while (available-- > 0) {
            arr[available] = (char) is.read();
        }
        String result = String.valueOf(arr);
        System.out.println(result);
    }
}
