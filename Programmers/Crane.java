import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Check ck = new Check();
        int doll_num;
        Stack<Integer> stack =new Stack();

        for(int i=0;i< moves.length;i++){
            doll_num=ck.check(board, moves[i]);
            if(doll_num==0){
                continue;
            }
            if(stack.empty()==true) {
                stack.push(doll_num);
            }
            else{
                int peek=stack.peek();
                if(peek==doll_num){
                    stack.pop();
                    answer++;
                }else {
                    stack.push(doll_num);
                }
            }


        }
        return answer*2;
    }
}

class Check{
    public int check(int[][] board, int n){
        int doll=0;
        for(int i=0;i< board.length;i++){
            if(!(board[i][n-1] ==0)){
                doll=board[i][n-1];
                board[i][n-1]=0;
                //System.out.println("doll: "+doll);
                break;
            }
        }
        return doll;

    }
}


public class Crane {
    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        Solution sol = new Solution();
        sol.solution(board,moves);

    }

}
