import java.util.HashMap;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class maingate_v2 {
    public static void main(String[] args) {
        String data = """
                8, 10, 20, 30, 40, 50
                9, 0, 10, 20, 30, 40, 50, 즐겨찾기
                10, 0, 10, 30, 50
                11, 10, 20, 40
                12, 20, 50
                13, 0, 20, 40
                14, 20, 40
                15, 20, 40
                16, 20, 40
                17, 20, 40
                """;

        HashMap<Integer, ArrayList<Integer>> timeSchedule = new HashMap<>();
        HashMap<Integer, Boolean> isFavorite = new HashMap<>();  // 즐겨찾기 map

        StringTokenizer lineTokenizer = new StringTokenizer(data, "\n");

        while (lineTokenizer.hasMoreTokens()) {
            String line = lineTokenizer.nextToken();
            StringTokenizer token = new StringTokenizer(line, ",");

            int time = Integer.parseInt(token.nextToken().trim());

            ArrayList<Integer> intervals = new ArrayList<>();
            boolean favorite = false;

            while (token.hasMoreTokens()) {
                String value = token.nextToken().trim();
                if (value.equals("즐겨찾기")) { // "즐겨찾기" 체크
                    favorite = true;
                } else {
                    intervals.add(Integer.parseInt(value));
                }
            }

            timeSchedule.put(time, intervals);
            isFavorite.put(time, favorite);
        }

        for (Integer time : timeSchedule.keySet()) {
            System.out.println("시간: " + time + ", 배차: " + timeSchedule.get(time) + ", 즐겨찾기: " + isFavorite.get(time));
        }
    }
}
