import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int[] directionsX = {-1, 1, 0, 0};
        int[] directionsY = {0, 0, -1, 1};
        int n = maps.length;
        int m = maps[0].length;

        maps[0][0] = 2;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0));


        while (!q.isEmpty()) {
            Node currentPosition = q.poll();
            int currentX = currentPosition.x;
            int currentY = currentPosition.y;

            for (int i = 0; i < 4; i++) {
                int nextX = currentX + directionsX[i];
                int nextY = currentY + directionsY[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && maps[nextX][nextY] == 1) {
                    maps[nextX][nextY] = maps[currentX][currentY] + 1;
                    q.add(new Node(nextX, nextY));
                }
            }
        }

        if (maps[n - 1][m - 1] == 1) {
            return -1;
        } else {
            return maps[n - 1][m - 1] - 1;
        }
    }

    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
