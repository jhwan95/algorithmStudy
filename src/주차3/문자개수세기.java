package 주차3;

public class 문자개수세기 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i=0; i<my_string.length(); i++) {

            int alpha = my_string.charAt(i);

            if(65 <= alpha && alpha <= 90) {

                answer[alpha-65]++;
            }else {
                answer[alpha-97+26]++;
            }

        }

        return answer;
    }
}
