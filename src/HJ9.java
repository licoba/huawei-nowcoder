import java.io.IOException;
import java.io.InputStream;

public class HJ9 {
    //HJ9 提取不重复的整数
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int len = in.available() - 1;
        char[] arr = new char[len];
        while (len > 0) {
            len--;
            arr[len] = (char) in.read();
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (str.lastIndexOf(String.valueOf(arr[i])) != -1) {
                continue;
            }
            str.append(arr[i]);
        }
        System.out.println(str.toString());
    }
}
