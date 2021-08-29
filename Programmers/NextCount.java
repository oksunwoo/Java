class Solution {
    public int solution(int n) {
        int answer = 0;

       BinaryCount bc = new BinaryCount();
       int nCount = bc.binCount(n);
       //System.out.println("nCount: "+nCount);


       BinaryCount bc2 = new BinaryCount();
       for(;;){
            n+=1;
            if(bc2.binCount(n)==nCount){
                answer=n;
                //System.out.println("answer: "+answer);
                break;
            }

        }
        return answer;
    }
}

class BinaryCount{
    public int binCount(int n){
        String toBinary;
        toBinary = Integer.toBinaryString(n);
        int cnt=0;
        for(int i=0;i<toBinary.length();i++){
            if(toBinary.charAt(i)=='1'){
                cnt++;
            }
        }
        //System.out.println("cnt: "+cnt);
        return cnt;

    }
}




public class NextCount {
    public static void main(String[] args){
        Solution sol= new Solution();
        int n=78;
        sol.solution(n);


    }


}
