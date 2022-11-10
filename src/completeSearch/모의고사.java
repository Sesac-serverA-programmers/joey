import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answerList = new ArrayList<>();
        int[][] supoja = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scoreArray = new int[]{0, 0, 0};
        for (int i = 0; i < supoja.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (supoja[i][j % (supoja[i].length)] == answers[j]) {
                    scoreArray[i] += 1;
                }
            }
        }

        int maxScore = -1;
        for (int score : scoreArray) {
            if (score > maxScore) {
                maxScore = score;
            }
        }

        for (int i = 0; i < scoreArray.length; i++) {
            if (scoreArray[i] == maxScore) {
                answerList.add(i + 1);
            }
        }


        return answerList.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
