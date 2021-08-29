import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {



        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< numbers.length;i++){
            for(int j=i+1;j< numbers.length;j++){
                if(!list.contains( numbers[i] + numbers[j])) {
                    list.add( numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(list);
        int[] answer = new int[list.size()];

        for(int i=0; i<answer.length;i++){
            answer[i]= list.get(i);
        }
       /* for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }*/
        return answer;
    }
}



public class TwoAdd {
    public static void main(String[] args){
        int numbers[] ={2,1,3,4,1};
        Solution sol = new Solution();
        sol.solution(numbers);
    }

}
