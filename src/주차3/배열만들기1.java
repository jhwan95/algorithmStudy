package 주차3;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기1 {
    public int[] solution(int n, int k) {

        List<Integer> list = new ArrayList<Integer>();

        int count = 1;
        while(count*k <= n) {

            list.add(count*k);
            count++;
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
