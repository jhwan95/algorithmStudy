package 주차3;

public class 문자열의뒤의n글자 {
    public String solution(String my_string, int n) {
        int start = my_string.length() - n;

        System.out.println(start);

        String answer = "";
        for(int i=start; i<my_string.length(); i++){

            answer += my_string.charAt(i);
        } // for

        return answer;
    }
}
