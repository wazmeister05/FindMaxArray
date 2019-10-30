import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args){
        FindMax fm = new FindMax();
        List<Integer> list = new ArrayList<>();

        list.add(42);
        list.add(10);
        list.add(3);
        list.add(233);
        list.add(225);
        list.add(69);
        list.add(8008135);

        long start = System.nanoTime();
        System.out.println("The max of the array is: " + fm.findMax(list));
        System.out.println(System.nanoTime() - start + " ns");

        start = System.nanoTime();
        Collections.max(list);
        System.out.println(System.nanoTime() - start + " ns");
    }

}
