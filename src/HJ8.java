import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

// HJ8 合并表记录
public class HJ8 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();  //分析下一个
        int n = (int) st.nval;//获取当前Token的值，nval获得值默认为double，sval获取字符串
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            st.nextToken();
            int key = (int) st.nval;
            st.nextToken();
            int value = (int) st.nval;
            arr[key] = arr[key] + value;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                sb.append(i).append(" ").append(arr[i]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
