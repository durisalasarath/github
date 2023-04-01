public class FifthClass1 {
    public static void main(String[] args) {
        System.out.println(return3TimesFirst3Chars("sarath"));
    }
    public static String return3TimesFirst3Chars(String s){
        return s.substring(0,3) + s.substring(0,3) + s.substring(0,3);
    }
}
