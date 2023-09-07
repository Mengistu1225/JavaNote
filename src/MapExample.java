import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
       /*
      Note: The Map interface maintains 3 different sets:
      1 the set of keys
      2 the set of values
      3 the set of key/value associations (mapping)
      */
        Map<String,Integer> map1=new Hashtable<>();
        map1.put("one",1);
        map1.put("two",2);
        map1.put("three",3);

        System.out.println(map1);
        System.out.println("the key of the map1 is: "+map1.keySet());
        System.out.println("the value of the map1 is: "+map1.values());
        System.out.println("the entyery of the map1 is : "+map1.entrySet());
        int deleteval=map1.remove("two");
        System.out.println(" the map1 after removed the element :"+map1);
        map1.replace("one",4);
        System.out.println(map1);


    }
}
