import java.io.IOException;
import java.io.InputStream;

public class HJ15 {
    // HJ15 求int型正整数在内存中存储时1的个数
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        int len;
        byte[] bytes = new byte[1024];
        while ((len = input.read(bytes)) > 0) {
            String numstr = new String(bytes, 0, len - 1);
            int num = Integer.parseInt(numstr);
            char[] ch = Integer.toBinaryString(num).toCharArray();
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '1') {
                    count = count + 1;
                }
            }
            System.out.println(count);
        }
    }
}
