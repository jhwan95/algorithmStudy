package 주차3;

public class 접두사인지확인하기 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;

        for(int i=0; i<my_string.length(); i++) {

            if(my_string.subSequence(0, i).equals(is_prefix)) {
                return 1;
            }

        } // for

        return answer;
    }
}
