package 주차3;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<intStrs.length; i++) {

            String value = "";
            String intStr = intStrs[i];

            for(int j=s; j<s+l; j++) {

                value += intStr.charAt(j);
            } // for

            int check = Integer.parseInt(value);
            if(check > k) {
                list.add(check);
            }
        } // for

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {

            answer[i] = list.get(i);

        } // for

        return answer;
    } // solution
}
