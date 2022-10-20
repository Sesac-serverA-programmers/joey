import java.util.HashMap;
import java.util.Map;


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
      
        // 배열을 <폰켓몬 종류, 폰켓몬 마리 수> 형태의 map으로 변환
        Map<Integer, Integer> map = new HashMap<>();
        for (int ponketmon : nums) {
            map.put(ponketmon, map.getOrDefault(ponketmon, 0) + 1);
        }

        // 전체 폰켓몬 종류의 개수를 (배열의 길이/2)와 비교하여 더 큰 값을 반환
        int length = nums.length;
        if (map.size() >= length / 2) {
            answer = length / 2;
        } else {
            answer = map.size();
        }
        return answer;
    }
}
