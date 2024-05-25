package 주차3;

public class 문자열뒤집기 {

    public String solution(String my_string, int s, int e) {

        String answer = my_string.substring(s,e+1);


        StringBuffer sb = new StringBuffer(answer);
        String reversedStr = sb.reverse().toString();


        my_string = my_string.replaceAll(answer, reversedStr);
        return my_string;
    }
}
