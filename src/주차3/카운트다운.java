package 주차3;

import java.util.ArrayList;
import java.util.List;

public class 카운트다운 {
    public int[] solution(int start, int end_num) {

        List<Integer> list = new ArrayList<>();

        for(int i=start; i>=end_num; i--){
            list.add(i);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
