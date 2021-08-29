class Solution2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int count=0;
        int zero_count=0;
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0)
                zero_count++;
            for(int j=0;j<win_nums.length;j++) {
                if (lottos[i] == win_nums[j]){
                    count++;
                }
            }
        }
        System.out.println("count: " +count);
        System.out.println("zero: " +zero_count);

        answer[0]=7-(count+zero_count);
        answer[1]=7-count;

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}
public class Solution{
    public static void main(String[] args){
        Solution2 sol =new Solution2();

        int[] arr1 = new int[]{44,1,0,0,31,25};
        int[] arr2 = new int[]{31,10,45,1,6,19};

        sol.solution(arr1,arr2);

    }
}
