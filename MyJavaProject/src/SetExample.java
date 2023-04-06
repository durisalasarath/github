import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // Array, List, Map, Set
        // Set is u
        Set<String> mySet = new HashSet<String>();

        mySet.add("lion");
        mySet.add("tiger");
        mySet.add("dove");
        mySet.add("lion");

        System.out.println(mySet);
    }
}