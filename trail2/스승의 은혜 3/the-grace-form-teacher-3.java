import java.io.*;
import java.util.*;

public class Main {
    static class Gift {
        long price;
        long shipping;

        Gift(long price, long shipping) {
            this.price = price;
            this.shipping = shipping;
        }

        long totalCost() {
            return price + shipping;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long budget = Long.parseLong(st.nextToken());

        Gift[] gifts = new Gift[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long price = Long.parseLong(st.nextToken());
            long shipping = Long.parseLong(st.nextToken());
            gifts[i] = new Gift(price, shipping);
        }

        // 가격 + 배송비가 저렴한 순서로 정렬
        Arrays.sort(gifts, Comparator.comparingLong(Gift::totalCost));

        int answer = 0;

        // 각 학생의 선물에 쿠폰을 사용하는 경우 확인
        for (int i = 0; i < n; i++) {
            long discountedCost = gifts[i].price / 2 + gifts[i].shipping;

            if (discountedCost > budget) {
                continue;
            }

            long remaining = budget - discountedCost;
            int count = 1;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                long cost = gifts[j].totalCost();

                if (cost > remaining) {
                    break;
                }

                remaining -= cost;
                count++;
            }

            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }
}