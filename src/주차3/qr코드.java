package 주차3;

public class qr코드 {
    public String solution(int q, int r, String code) {
        String answer = "";

        for(int i=0; i<code.length(); i++) {
            int share = i%q;

            if(share == r) {
                answer += code.charAt(i);
            }
        }

        return answer;
    }
}
