import javax.swing.plaf.synth.SynthOptionPaneUI;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] toBin = new String[n];

        for(int i=0;i<n;i++){
            toBin[i]=Integer.toBinaryString(arr1[i]|arr2[i]);
            if(toBin[i].length()<n){
                for(int j=toBin[i].length();j<n;j++) {
                    toBin[i] = "0" + toBin[i];
                }
            }
            toBin[i]=toBin[i].replace("1","#").replace("0"," ");

        }
        for(int i=0;i<n;i++){
            System.out.print(toBin[i]+"//");
        }

        return toBin;
    }
}



public class SecretMap {
    public static void main(String[] args){
        int n=5;
        int[] arr1={0,0,0,0,0};
        int[] arr2={30,1,21,17,28};

        Solution sol = new Solution();
        sol.solution(n,arr1,arr2);



    }

}
