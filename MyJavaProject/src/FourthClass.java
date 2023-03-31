public class FourthClass {
    public static void main(String[] args) {
        System.out.println(isOdd(7));
        System.out.println(isEven(8));
    }
    public static boolean isOdd(int n){
        if (n%2==1){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isEven(int n){
        if (n%2!=1){
            return true;
        }
        else {
            return false;
        }
    }
}
