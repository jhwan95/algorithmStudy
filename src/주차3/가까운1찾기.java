package 주차3;

public class 가까운1찾기 {

    public int solution(int[] arr, int idx) {
        int answer = 0;

        boolean flag = false;

        for(int i=idx; i<arr.length; i++){

            if(arr[i] == 1){
                flag = true;
                answer = i;
                break;
            }
        }

        if(!flag)
            return -1;
        else
            return answer;
    }
}
