
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class HJ27 {
    // HJ27 查找兄弟单词
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine()) != null) {
            // 将输入的字符串分割成字符串数组
            String[] words = s.split(" ");
            // 待查找单词
            String str = words[words.length - 2];
            // 兄弟单词表里的第k个兄弟单词
            int k = Integer.parseInt(words[words.length - 1]);
            // 存放兄弟单词表
            ArrayList<String> broWords = new ArrayList<>();
            // 遍历输入的单词
            for (int i = 1; i < words.length - 2; i++) {
                // 不相等且长度相同
                if ((!words[i].equals(str)) && words[i].length() == str.length()) {
                    char[] chStr = str.toCharArray();
                    char[] word = words[i].toCharArray();
                    int temp = 0;
                    for (int j = 0; j < chStr.length; j++) {
                        for (int j2 = 0; j2 < word.length; j2++) {
                            if (word[j] == chStr[j2]) {
                                chStr[j2] = '0';
                                temp++;
                                break;
                            }
                        }
                    }
                    if (temp == chStr.length) {
                        broWords.add(words[i]);
                    }
                }
            }
            System.out.println(broWords.size());
            if (k > 0 && k <= broWords.size()) {
                Collections.sort(broWords);
                System.out.println(broWords.get(k - 1));
            }
        }
    }
}
