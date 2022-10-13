package heap;

import java.util.*;


class Solution {
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
                    if (map.containsKey(max)) {
                        map.put(max, map.get(max) - 1);
                        if (map.get(max) == 0) {
                            map.remove(max);
                        }
                    }

                } else {
                    //최소값 삭제
                    int min = minQueue.poll();
                    if (map.containsKey(min)) {
                        map.put(min, map.get(min) - 1);
                        if (map.get(min) == 0) {
                            map.remove(min);
                        }
                    }

                }
            }
        }

        if (map.size() == 0) {
            answer = new int[]{0, 0};
        } else {
            answer = new int[]{maxQueue.peek(), minQueue.peek()};
        }

        return answer;
    }

}
