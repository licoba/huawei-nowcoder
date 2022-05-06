
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class HJ29 {
    // HJ29 字符串加解密
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            String word = br.readLine();
            System.out.println(jiami(str));
            System.out.println(jiemi(word));
        }
    }

    public static String jiami(String str) {
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (ch[i] == 'z')
                    sb.append('A');
                else
                    sb.append((char) (ch[i] - 32 + 1));

            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                if (ch[i] == 'Z')
                    sb.append('a');
                else
                    sb.append((char) (ch[i] + 32 + 1));
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                if (ch[i] == '9')
                    sb.append('0');
                else
                    sb.append(ch[i] - '0' + 1);

            }

        }

        return sb.toString();
    }

    public static String jiemi(String str) {
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (ch[i] == 'a')
                    sb.append('Z');
                else
                    sb.append((char) (ch[i] - 32 - 1));

            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                if (ch[i] == 'A')
                    sb.append('z');
                else
                    sb.append((char) (ch[i] + 32 - 1));
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                if (ch[i] == '0')
                    sb.append('9');
                else
                    sb.append(ch[i] - '0' - 1);

            }

        }

        return sb.toString();
    }


}