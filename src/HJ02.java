import java.util.*;

// HJ2 计算某字符出现次数
public class HJ02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String all = "";
        String one = "";
        char[] ac;
        int num = 0;
        while (s.hasNext()) {
            all = s.nextLine();
            one = s.nextLine();
            ac = all.toCharArray();
            for (int i = 0; i < ac.length; i++) {
                if (one.equalsIgnoreCase(String.valueOf(ac[i])))
                    num++;
            }
            System.out.println(num);
            return;
        }
    }
}
