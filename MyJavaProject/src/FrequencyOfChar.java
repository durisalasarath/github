public class FrequencyOfChar {
    public static void main(String[] args) {
        String s="Big data analytics ttt";

        System.out.println(frequencyOfChar(s));
    }
    public static int frequencyOfChar(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='t'){
                count++;
            }
        }
        return count;
    }
}
