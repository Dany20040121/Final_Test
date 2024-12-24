import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BusApp_v1 {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> timeSchedule = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\bldh1\\OneDrive\\바탕 화면\\MainGate.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line, ",");

                int time = Integer.parseInt(token.nextToken().trim());

                ArrayList<Integer> intervals = new ArrayList<>();
                while (token.hasMoreTokens()) {
                    intervals.add(Integer.parseInt(token.nextToken().trim()));
                }

                timeSchedule.put(time, intervals);
            }
        } catch (IOException e) {
            System.out.println("오류발생!!!!");
            e.printStackTrace();
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry : timeSchedule.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("시간을 입력하세요 (예: 10:30): ");
        String inputTimeStr = scanner.nextLine();

        String[] timeParts = inputTimeStr.split(":");
        int inputHour = Integer.parseInt(timeParts[0]);
        int inputMinute = Integer.parseInt(timeParts[1]);

        int inputTimeInMinutes = inputHour * 60 + inputMinute;


        int closestTimeInMinutes = -1;
        int minDifference = Integer.MAX_VALUE;  //  두시간간의 차이 중 가장 작은 차이 저장

        for (Integer time : timeSchedule.keySet()) {
            ArrayList<Integer> intervals = timeSchedule.get(time);
            for (Integer interval : intervals) {
                int busTimeInMinutes = time * 60 + interval; // 버스 출발 시간 (분 단위)

                int difference = busTimeInMinutes - inputTimeInMinutes;

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
