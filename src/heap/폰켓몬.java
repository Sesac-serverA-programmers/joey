import java.util.HashMap;
import java.util.Map;


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int ponketmon : nums) {
            map.put(ponketmon, map.getOrDefault(ponketmon, 0) + 1);
        }

        int length = nums.length;
        if (map.size() >= length / 2) {
            answer = length / 2;
        } else {
            answer = map.size();
        }
        return answer;
    }
}
