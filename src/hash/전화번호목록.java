import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
      //오름차순 정렬
        Arrays.sort(phone_book);

      //현재 전화번호가 다음 전화번호의 접두어인지를 확인
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer=false;
                break;
            }            
        }    
        return answer;
    }
}
