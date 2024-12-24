import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Scanner;

public class maingate_v4 {
    public static void main(String[] args) {
        String data = """
                8, 10, 20, 30, 40, 50
                9, 0, 10, 20, 30, 40, 50
                10, 0, 10, 30, 50
                11, 10, 20, 40
                12, 20, 50
                13, 0, 20, 40
                14, 20, 40
                15, 20, 40
                16, 20, 40
                17, 20, 40
                """;

        HashMap<Integer, ArrayList<Integer>> timeScedule = new HashMap<>();

        StringTokenizer lineTokenizer = new StringTokenizer(data, "\n");
        while (lineTokenizer.hasMoreTokens()) {
            String line = lineTokenizer.nextToken();
            StringTokenizer token = new StringTokenizer(line, ",");

            int time = Integer.parseInt(token.nextToken().trim());

            ArrayList<Integer> intervals = new ArrayList<>();
            while (token.hasMoreTokens()) {
                intervals.add(Integer.parseInt(token.nextToken().trim()));
            }

            timeScedule.put(time, intervals);
        }

        // 사용자가 입력한 시간 받기 (시:분 형식)
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간을 입력하세요 (예: 10:30): ");
        String inputTimeStr = scanner.nextLine();

        // 입력 받은 시간을 시와 분으로 나누기
        String[] timeParts = inputTimeStr.split(":");
        int inputHour = Integer.parseInt(timeParts[0]);
        int inputMinute = Integer.parseInt(timeParts[1]);

        int inputTimeInMinutes = inputHour * 60 + inputMinute;

        // 사용자가 입력한 시간과 비교할 가장 가까운 버스 출발 시간 찾기
        int closestTimeInMinutes = -1;
        int minDifference = Integer.MAX_VALUE;  //  두시간간의 차이 중 가장 작은 차이 저장

        for (Integer time : timeScedule.keySet()) {
            // 각 출발 시간을 분 단위로 변환하여 비교
            ArrayList<Integer> intervals = timeScedule.get(time);
            for (Integer interval : intervals) {
                int busTimeInMinutes = time * 60 + interval; // 버스 출발 시간 (분 단위)

                // 입력 시간과 출발 시간 차이를 계산
                int difference = busTimeInMinutes - inputTimeInMinutes;

                // 만약 차이가 양수이고, 이전에 찾은 시간보다 차이가 적다면
                if (difference >= 0 && difference < minDifference) {
                    minDifference = difference;
                    closestTimeInMinutes = busTimeInMinutes;
                }
            }
        }

        // 결과 출력
        if (closestTimeInMinutes != -1) {
            int closestHour = closestTimeInMinutes / 60;
            int closestMinute = closestTimeInMinutes % 60;

            System.out.println("가장 가까운 버스 출발 시간은 " + closestHour + ":" + String.format("%02d", closestMinute) + "입니다.");
            System.out.println("버스는 " + minDifference + "분 후에 출발합니다.");
        } else {
            System.out.println("입력하신 시간 이후에는 더 이상 출발하는 버스가 없습니다.");
        }
    }
}
