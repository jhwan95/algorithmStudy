package 주차3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 접미사배열 {
    public String[] solution(String my_string) {

        List<String> answer = new ArrayList<>();

        for(int i=0; i<my_string.length(); i++) {

            answer.add(my_string.substring(i));
        } // for

        Collections.sort(answer);
        String[] answer1 = new String[answer.size()];
        for(int i=0; i<answer.size(); i++) {

            answer1[i] = answer.get(i);

        } // for

        return answer1;
    }
}
