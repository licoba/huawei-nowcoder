import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ26 {
    // HJ26 字符串排序
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            char[] ch = s.toCharArray();
            char[] chars = new char[ch.length];
            int flag = 65, j = 0;
            while (flag <= 90) {
                for (int i = 0; i < ch.length; i++) {
                    if ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) {
                        if (ch[i] == flag || ch[i] == flag + 32) {
                            chars[j] = ch[i];
                            j++;
                        }
                    }
                }
                flag++;
            }
            j = 0;
            for (int i = 0; i < ch.length; i++) {
                if ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) {
                    ch[i] = chars[j];
                    j++;
                }
            }
            System.out.println(String.valueOf(ch));
        }
    }
}
