import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class HJ25 {
    // HJ25 数据分类处理
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int inputNum = 0;
        while ((str = reader.readLine()) != null) {
            if ("".equals(str)) {
                continue;
            }
            String iText = str;
            String rText = reader.readLine();
            String[] iArr = iText.split(" ");
            String[] rArr = rText.split(" ");
            long[] rLArr = new long[Integer.parseInt(rArr[0])];
            for (int i = 0; i < rLArr.length; i++) {
                rLArr[i] = Long.parseLong(rArr[i + 1]);
            }
            Arrays.sort(rLArr);
            StringBuilder front = new StringBuilder();
            int count = 0;
            for (int i = 0; i < rLArr.length; i++) {
                int num = 0;
                if (i > 0 && rLArr[i] == rLArr[i - 1]) {
                    continue;
                }
                String pattern = rLArr[i] + "";
                StringBuilder sb = new StringBuilder();
                for (int j = 1; j < iArr.length; j++) {
                    if (iArr[j].indexOf(pattern) != -1) {
                        num++;
                        sb.append(" ").append(j - 1).append(" ").append(iArr[j]);
                    }
                }
                if (num > 0) {
                    count += num * 2 + 2;
                    front.append(" ").append(rLArr[i]).append(" ").append(num).append(sb);
                }
            }
            System.out.println(count + front.toString());
        }
    }
}
