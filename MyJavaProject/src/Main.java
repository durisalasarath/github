public class Main {
    public static void main(String[] args) {
        System.out.println(sumOf2Numbers(4,2));

        System.out.println(difOf2Numbers(4,2));

        System.out.println(proOf2Numbers(4,2));

        System.out.println(divOf2Numbers(4,2));

        System.out.println(remOf2Numbers(4,2));
    }
    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }
    public static int difOf2Numbers(int a, int b){
        return a-b;
    }

    public static int proOf2Numbers(int a, int b){
        return a*b;
    }

    public static int divOf2Numbers(int a, int b){
        return a/b;
    }

    public static int remOf2Numbers(int a, int b){
        return a%b;
    }
}