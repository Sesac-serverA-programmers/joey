package heap;

import java.util.*;

public class DoublePriorityQueue {
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1" };
        SolutionDoublePriorityQueue sdpq = new SolutionDoublePriorityQueue();
        int[] result = sdpq.solution(operations);

        for (int i : result) {
            System.out.print(i+" ");
        }

    }
}

class SolutionDoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (String operation : operations) {
            String action = operation.split(" ")[0];
            int value = Integer.parseInt(operation.split(" ")[1]);

            // I 명렁일 때
            if (action.equals("I")) {
                maxQueue.add(value);
                minQueue.add(value);
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
            // D 명령일 때
            else {
                if (map.size() == 0) {
                    continue;
                }

                if (value == 1) {
                    //최대값 삭제
                    int max = maxQueue.poll();
                    int count = map.getOrDefault(max, 0);
                    if(count==0) continue;

                } else {
                    //최소값 삭제

                }
            }
        }
        return answer;
    }

}