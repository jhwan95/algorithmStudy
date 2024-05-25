package 주차3;

import java.util.Arrays;

public class 글자지우기 {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        Arrays.sort(indices);

        for(int i=0; i<my_string.length(); i++) {

            boolean flag = false;

            for(int j=0; j<indices.length; j++) {
                if(indices[j] == i) {
                    flag = true;
                    break;
                }
            }

            if(flag) 	continue;
            else {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
