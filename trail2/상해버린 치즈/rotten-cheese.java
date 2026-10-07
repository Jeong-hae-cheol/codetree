import java.util.*;

public class Main {

    static final int INF = 1_000_000_000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수
        int M = sc.nextInt(); // 치즈 종류 수
        int D = sc.nextInt(); // 먹은 기록 수
        int S = sc.nextInt(); // 아픈 사람 기록 수

        // firstEat[p][m]
        // p번 사람이 m번 치즈를 처음 먹은 시간
        int[][] firstEat = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            Arrays.fill(firstEat[i], INF);
        }

        // 먹은 기록
        for (int i = 0; i < D; i++) {

            int person = sc.nextInt();
            int cheese = sc.nextInt();
            int time = sc.nextInt();

            firstEat[person][cheese] =
                Math.min(firstEat[person][cheese], time);
        }

        // 아픈 사람 정보
        int[] sickPerson = new int[S];
        int[] sickTime = new int[S];

        for (int i = 0; i < S; i++) {
            sickPerson[i] = sc.nextInt();
            sickTime[i] = sc.nextInt();
        }

        int answer = 0;

        // 각 치즈를 상한 치즈라고 가정
        for (int cheese = 1; cheese <= M; cheese++) {

            boolean possible = true;

            // 모든 아픈 사람이
            // 아프기 전에 이 치즈를 먹었는지 확인
            for (int i = 0; i < S; i++) {

                int person = sickPerson[i];
                int time = sickTime[i];

                if (firstEat[person][cheese] >= time) {
                    possible = false;
                    break;
                }
            }

            // 상한 치즈가 될 수 없다면 다음 치즈
            if (!possible) {
                continue;
            }

            // 이 치즈를 먹은 사람 수
            int count = 0;

            for (int person = 1; person <= N; person++) {
                if (firstEat[person][cheese] != INF) {
                    count++;
                }
            }

            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }
}