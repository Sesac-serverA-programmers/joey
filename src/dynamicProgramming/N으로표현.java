import java.util.*;


class Solution {    
    public int solution(int N, int number) {        
        if(N==number){
            return 1;
        }

        ArrayList<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(new HashSet<Integer>());
        }

        list.get(1).add(N);


        for (int i = 2; i < 9; i++) {
            Set<Integer> set = list.get(i);

            for (int j = 1; j < i; j++) {
                Set<Integer> set1 = list.get(j);
                Set<Integer> set2 = list.get(i - j);

                for (Integer integer1 : set1){
                    for (Integer integer2 : set2) {
                        set.add(integer1 + integer2);
                        set.add(integer1 - integer2);
                        set.add(integer1 * integer2);
                        if (integer2 != 0) {
                            set.add(integer1 / integer2);
                        }
                    }
                }
            }

            int repeatedNum = 0;
            for (int j = 0; j < i; j++) {
                repeatedNum = repeatedNum * 10 + N;
            }
            set.add(repeatedNum);

            if (list.get(i).contains(number)) {
                return i;
            }
        }
        
        return -1;
    }
}
