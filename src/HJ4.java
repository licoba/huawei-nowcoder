import java.util.Scanner;

// HJ4 字符串分隔
public class HJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            StringBuffer sb = new StringBuffer(s);
            if (s.length() % 8 != 0) {
                int n = 8 - s.length() % 8;
                for (int i = 0; i < n; i++) {
                    sb.append("0");
                }
            }
            while (sb.length() >= 8) {
                System.out.println(sb.substring(0, 8));
                sb = sb.delete(0, 8);
            }
        }
    }
}
