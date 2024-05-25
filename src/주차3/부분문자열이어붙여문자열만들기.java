package 주차3;

public class 부분문자열이어붙여문자열만들기 {
    public String solution(String[] my_strings, int[][] parts) {

        String sum = "";
        for(int i=0; i<parts.length; i++){

            String my_string = my_strings[i];
            for(int j=parts[i][0]; j<=parts[i][1]; j++){
                sum += my_string.charAt(j);
            } // for
        } // for
        return sum;
    } // solution
}
