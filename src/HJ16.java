import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ16 {
    // HJ16 购物单
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
//         while((str = br.readLine()) != null){
        String[] money_number = str.split(" ");
        int money = Integer.parseInt(money_number[0]);//钱数
        int count = Integer.parseInt(money_number[1]);//物品数
        int v[] = new int[count + 1];//物品的v p q和附件序号
        int p[] = new int[count + 1];
        int q[] = new int[count + 1];
        int sub1[] = new int[count + 1];
        int sub2[] = new int[count + 1];
        int dw = 100;
        boolean flag = true;
        for (int i = 1; i < count + 1; i++) {//第i件物品的属性
            String obj[] = br.readLine().split(" ");
            v[i] = Integer.parseInt(obj[0]);
            if (flag && v[i] % dw != 0) {
                dw = 10;
                flag = false;
                for (int m = 1; m < i; m++) {//出现不是整百的，按整十除
                    v[m] *= 10;
                    p[m] *= 10;
                }
            }
            v[i] = v[i] / dw;
            p[i] = Integer.parseInt(obj[1]) * v[i];//价值=价格*权重，需要的是p最大
            q[i] = Integer.parseInt(obj[2]);
            if (q[i] > 0) {//是附件
                if (sub1[q[i]] == 0)
                    sub1[q[i]] = i;//是附件1
                else
                    sub2[q[i]] = i;//是附件2
            }
        }
        money /= dw;
        int dp[][] = new int[count + 1][money + 1];//money为啥+1？
        for (int i = 1; i < count + 1; i++) {//两层for循环，动态规划二维表逐列逐行
            int p1 = 0, p2 = 0, p3 = 0;//根据附件数量，分4种情况v[i]、v1、v2、v3
            int v1 = -1, v2 = -1, v3 = -1;//
            if (sub1[i] != 0) {
                v1 = v[i] + v[sub1[i]];
                p1 = p[i] + p[sub1[i]];
            }
            if (sub2[i] != 0) {
                v2 = v[i] + v[sub2[i]];
                p2 = p[i] + p[sub2[i]];
            }
            if (sub1[i] != 0 && sub2[i] != 0) {
                v3 = v1 + v2 - v[i];
                p3 = p1 + p2 - p[i];
            }
            for (int j = 1; j < money + 1; j++) {
                dp[i][j] = dp[i - 1][j];//最大价值最少是这一件不放进去的大小
                if (q[i] == 0) {
                    if (j >= v[i]) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v[i]] + p[i]);
                    if (v1 != -1 && j >= v1) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v1] + p1);
                    if (v2 != -1 && j >= v2) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v2] + p2);
                    if (v3 != -1 && j >= v3) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v3] + p3);
                }
            }
        }
        System.out.println(dp[count][money] * dw);
    }
}
