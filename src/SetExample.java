import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        /*Set<Integer> set1=new HashSet<>();
        set1.add(12);
        set1.add(32);
        set1.add(2);
        set1.add(54);

        System.out.println(" set1 : " +set1);

        Set<Integer> set2=new HashSet<>();
        set2.add(1);
        set2.add(30);
        set2.add(2);
        set2.add(5);

        System.out.println(" set2 : " +set2);


        set2.containsAll(set1);
        System.out.println("intersection of set1 and set2 ;" +set2);
        set2.addAll(set1);
        System.out.println("unioun of set1 and set2 : " +set2);*/

        Set<Integer> numbers=new TreeSet<>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(3);
        numbers.add(23);
        numbers.add(10);
        System.out.println("the numbers are : "+numbers);

        Iterator<Integer> iter=numbers.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());

        }
    }
}
