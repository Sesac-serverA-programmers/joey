class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        for (int i = 0; i < sizes.length; i++) {
            int longerLength = Math.max(sizes[i][0], sizes[i][1]);
            int shorterLength = Math.min(sizes[i][0], sizes[i][1]);

            width = Math.max(width, longerLength);
            height = Math.max(height, shorterLength);
        }
        answer = width * height;

        return answer;
    }
}
