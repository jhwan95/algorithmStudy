package 주차3;

public class 의2영역 {
    public int[] solution(int[] arr) {
        int[] he = null;

        int start = find2FromStart(arr);
        int end = find2FromEnd(arr);

        if(start != end){
            int[] answer = new int[end-start+1];
            for(int i=start; i<=end; i++){

                answer[i-start] = arr[i];

            }
            return answer;
        }else if(start == end && start!=-1){

            return new int[]{2};

        }else{

            return new int[]{-1};
        }

    }

    static int find2FromStart(int[] arr){

        for(int i=0; i<arr.length; i++){

            if(arr[i]==2){
                return i;
            }
        }

        return - 1;
    }

    static int find2FromEnd(int[] arr){

        for(int i=arr.length-1; i>=0; i--){

            if(arr[i]==2){
                return i;
            }
        }

        return -1;
    }
}
