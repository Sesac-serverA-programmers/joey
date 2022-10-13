import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
                int answer = 0;

        //scoville list를 만들기
        PriorityQueue<Integer> scovilleList = new PriorityQueue<>();

        for (int i : scoville) {
            scovilleList.add(i);
        }

        //list에 스코빌 K이하의 음식이 존재하면
        //음식 융합 연산 진행하기
        while (scovilleList.peek() < K) {
            if (scovilleList.size() == 1) {
                answer = -1;
                break;
            } else {
                int dish1 = scovilleList.poll();
                int dish2 = scovilleList.poll();

                int newDish = dish1 + dish2 * 2;
                if (newDish >= K) {
                    scovilleList.add(newDish);
                } else {
                    scovilleList.add(newDish);
                }
                answer++;
            }
        }

        return answer;
    }
}
