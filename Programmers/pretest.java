import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int []answer = {};
        int[] st_1={1,2,3,4,5};
        int[] st_2={2,1,2,3,2,4,2,5};
        int[] st_3={3,3,1,1,2,2,4,4,5,5};

        int count_1 =0;
        int count_2 =0;
        int count_3 =0;

        for(int i =0; i<answers.length; i++){
            if(st_1[i%st_1.length] == answers[i]) count_1++;
            if(st_2[i%st_2.length] == answers[i]) count_2++;
            if(st_3[i%st_3.length] == answers[i]) count_3++;
        }


       /* for(int i=0,j=0;i<answers.length;i++,j++){
            if(answers[i]==st_1[j]){
                count_1++;
            }
            if(j==st_1.length-1){
                j=0;
            }
        }

        for(int i=0,j=0;i<answers.length;i++,j++){
            if(answers[i]==st_2[j]){
                count_2++;
            }
            if(j==st_2.length-1){
                j=0;
            }
        }

        for(int i=0,j=0;i<answers.length;i++,j++){
            if(answers[i]==st_3[j]){
                count_3++;
            }
            if(j==st_3.length-1){
                j=0;
            }
        }
*/
        int max = Math.max(Math.max(count_1, count_2),count_3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==count_1) list.add(1);
        if(max==count_2) list.add(2);
        if(max==count_3) list.add(3);

        answer = new int[list.size()];

        for(int i=0; i<list.size();i++){
            answer[i]= list.get(i);
        }
       return answer;
    }
}


public class pretest {
    public static void main(String[] args){

    }
}
