import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

      // <선수 이름, 선수 수> map 생성
        Map<String, Integer> map = new HashMap<>();

      // map에 참가 선수 추가
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
      // map에서 완주 선수 제거
        for (String p : completion) {
            map.put(p, map.get(p)-1);
        }


        for (String s : map.keySet()) {
            if (map.get(s)==1) {
                answer = s;
                break;
            }
        }

        return answer;
    }
}
