import java.util.HashSet;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashing {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        // size
        System.out.println("size of set is:" + set.size());

        System.out.println(set);
        // search
        // if (set.contains(2)) {
        // System.out.println("set contains 2");
        // }
        // if (!set.contains(6)) {
        // System.out.println("set does not contains 6");
        // }

        // // delete
        // set.remove(1);
        // if (!set.contains(1)) {
        // System.out.println("removed");
        // }

        // iterator
        Iterator itr = set.iterator();
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.hasNext());
        while (itr.hasNext()) {
            System.out.println(itr.next());// next() automatically updates the function it does not need increament ++
                                           // and decrement --
        }

    }
}