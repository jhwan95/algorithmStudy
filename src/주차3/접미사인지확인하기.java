package 주차3;

import java.util.ArrayList;
import java.util.List;

public class 접미사인지확인하기 {
    public int solution(String my_string, String is_suffix) {

        List<String> list = new ArrayList<>();

        int flag = 0;
        for(int i=0; i<my_string.length(); i++) {

            String s = my_string.substring(i);
            if(s.equals(is_suffix)) {
                flag = 1;
            }
        }

        return flag;




    }
}
