

class Solution {
    public int solution(String s) {
        int answer = 0;

        String a= s.replace("one","1").replace("two","2").replace("three","3").replace("four","4").replace("five","5").replace("six","6").replace("seven","7").replace("eight","8").replace("nine","9").replace("zero","0");

        answer=Integer.parseInt(a);

        System.out.println(answer);
        return answer;
    }
}




public class Alphabet {
    public static void main(String[] args){
        Solution sol = new Solution();
        String s= "one4seveneight";

        sol.solution(s);



    }






}
