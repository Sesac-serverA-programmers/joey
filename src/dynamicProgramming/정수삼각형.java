class Solution {
    public int solution(int[][] triangle) {
                int answer = 0;

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                int left = 0;
                int right = 0;

                try {
                    left = triangle[i - 1][j - 1];
                } catch (Exception e) {
                    left = -1;
                }

                try {
                    right = triangle[i - 1][j];
                } catch (Exception e) {
                    right = -1;
                }

                triangle[i][j] += Math.max(left, right);
            }
        }

        int i = triangle.length - 1;
        for (int j = 0; j < triangle[i].length; j++) {
            if (triangle[i][j] > answer) {
                answer = triangle[i][j];
            }
        }

        return answer;
    }
}
