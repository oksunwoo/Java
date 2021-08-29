

class Solution {
    public String solution(String new_id) {

        String step1 = new_id.toLowerCase();

        String step2= step1.replaceAll("[^a-z0-9-_.]","");

        String step3=step2;
        String tmp=step3;
        step3=step2.replace("..",".");
        for (;;){
            step3=step3.replace("..",".");
            if(tmp.equals(step3)){
                break;
            }
            tmp=step3;
        }
        //String step3 = step2.replaceAll("[.]{2,}", ".");
        String step4 = step3;
        if(step3.charAt(0)=='.'){
            step4 = step3.substring(1,step3.length());
        }
        if(step3.charAt(step3.length()-1)=='.'){
            step4 =step3.substring(0,step3.length()-1);
        }
        //step4 = step3.replaceAll("^[.]|[.]$", "");

        String step5 = step4;
        if(step5.isEmpty()==true){
            step5= "a";
        }
        String step6 = step5;
        if(step6.length()>=16){
            step6= step6.substring(0,15);
        }
        if(step6.charAt(step6.length()-1)=='.'){
            step6=step6.substring(0,step6.length()-1);
        }
        String step7=step6;
        if(step7.length()<=2){
            step7.charAt(step7.length()-1);
            for(int i=step7.length();i<3;i++){
                step7= step7 + step7.charAt(step7.length()-1);
            }
        }
        return step7;
    }


}





public class NewId {
}
