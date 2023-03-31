public class FourthClass2 {
    public static void main(String[] args) {
        System.out.println(areWePartying(true,true));
        System.out.println(areWePartying(true,false));
        System.out.println(areWePartying(false,true));
        System.out.println(areWePartying(false,false));
    }
    public static boolean areWePartying(boolean weekend, boolean festival){
        if(weekend==true||festival==true){
            return true;
        }
        else {
            return false;
        }
    }
}
