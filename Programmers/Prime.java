class Solut {
    public int solution(int[] nums) {
        int answer = 0;
        int prime_number = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                for(int k=j+1;k<nums.length;k++){

                    prime_number=nums[i]+nums[j]+nums[k];
                    if(isPrime(prime_number)==true){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}





public class Sol {
    public static void main(String[] args){

    }
}


