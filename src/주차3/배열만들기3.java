package 주차3;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기3 {
    public static int[] solution(int[] arr, int[][] intervals) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for(int i=intervals[0][0]; i<=intervals[0][1]; i++){

            firstList.add(arr[i]);
        }

        for(int i=intervals[1][0]; i<=intervals[1][1]; i++){

            secondList.add(arr[i]);
        }

        List<Integer> thirdList = new ArrayList<>();
        thirdList.addAll(firstList);
        thirdList.addAll(secondList);


        int[] answer = new int[thirdList.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = thirdList.get(i);
        }
        return answer;
    }
}
