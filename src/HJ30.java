import java.util.*;
import java.io.*;

public class HJ30 {
    // HJ30 字符串合并处理
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null) {
            String[] str = s.split(" ");
            s = str[0] + str[1];
            char[] array = sort(s);
            System.out.println(transform(array));
        }
    }

    public static char[] sort(String s) {
        char[] array = s.toCharArray();
        int i, j;
        for (i = 2; i < array.length; i += 2) {
            if (array[i] < array[i - 2]) {
                char tmp = array[i];
                for (j = i; j > 0 && array[j - 2] > tmp; j -= 2) {
                    array[j] = array[j - 2];
                }
                array[j] = tmp;
            }
        }
        for (i = 3; i < array.length; i += 2) {
            if (array[i] < array[i - 2]) {
                char tmp = array[i];
                for (j = i; j > 1 && array[j - 2] > tmp; j -= 2) {
                    array[j] = array[j - 2];
                }
                array[j] = tmp;
            }
        }
        return array;
    }

    public static String transform(char[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = -1;
            if (array[i] >= 'A' && array[i] <= 'F') {
                num = array[i] - 'A' + 10;
            } else if (array[i] >= 'a' && array[i] <= 'f') {
                num = array[i] - 'a' + 10;
            } else if (array[i] >= '0' && array[i] <= '9') {
                num = array[i] - '0';
            }

            if (num != -1) { // 需要转换
                num = (num & 1) * 8 + (num & 2) * 2 + (num & 4) / 2 + (num & 8) / 8;
                if (num < 10) {
                    array[i] = (char) (num + '0');
                } else if (num < 16) {
                    array[i] = (char) (num - 10 + 'A');
                }
            }
        }
        return new String(array);
    }
}