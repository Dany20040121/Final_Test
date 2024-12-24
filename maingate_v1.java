import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class maingate_v1 {
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

        for (Integer time : timeScedule.keySet()) {
            System.out.println("시간: " + time + ", 배차: " + timeScedule.get(time));
        }

    }
}
