import java.util.LinkedList;
import java.util.Queue;

class Solution {
public int solution(int[][] maps) {
        int[] directionsX = {-1, 1, 0, 0};
        int[] directionsY = {0, 0, -1, 1};

        maps[0][0] = 2;
        Queue<Integer[]> q = new LinkedList<>();
        q.add(new Integer[]{0, 0});


        while (!q.isEmpty()) {
            Integer[] currentPosition = q.poll();
            int x = currentPosition[0];
            int y = currentPosition[1];

            for (int i = 0; i < 4; i++) {
                int newX = x + directionsX[i];
                int newY = y + directionsY[i];

                if (newX >= 0 && newX < maps.length && newY >= 0 && newY < maps[0].length && maps[newX][newY] == 1) {
                    maps[newX][newY] = maps[x][y] + 1;
                    q.add(new Integer[]{newX, newY});
                }
            }
        }

        if (maps[maps.length-1][maps[0].length-1] == 1) {
            return -1;
        } else {
            return maps[maps.length-1][maps[0].length-1]-1;
        }
    }
}
