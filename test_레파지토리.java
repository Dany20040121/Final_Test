import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queueDemo1 {
    public static void main(String[] args) {
        String s = "보고서.pdf 사진.jpg 발표자료.ppt";
        String input = "10 3 25";

        Queue<String> strings = new LinkedList<>();
        Queue<Integer> integers = new LinkedList<>();


        StringTokenizer st = new StringTokenizer(s," ,");
        StringTokenizer st1 = new StringTokenizer(input," ,");


        while(st.hasMoreTokens()){
            strings.offer(st.nextToken());
        }

        while(st1.hasMoreTokens()){
            String token = st1.nextToken();
            int number = Integer.parseInt(token);
            integers.offer(number);
        }

        while(!strings.isEmpty()){
            System.out.println(strings.poll() + "/ " + integers.poll());
        }





    }
}
