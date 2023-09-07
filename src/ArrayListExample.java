import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
  //  arraylist creation
        List<String> language=new ArrayList<>();
        language.add("jave");
        language.add("python");
        language.add("swift");
        language.add("c++");
// insertion
        System.out.println(language);
        language.add(2,"javascript");
        language.add("c");
        System.out.println(language);
// insertion all values of set into arraylist

        Set<String> vawols=new HashSet<>();
        vawols.add("a");
        vawols.add("e");
        vawols.add("i");
        vawols.add("o");
        vawols.add("u");

        ArrayList<String>  alphabet = new ArrayList<>();
        alphabet.addAll(vawols);

        System.out.println(alphabet);
//get the elements from the arralist
        System.out.println(language.get(3));
        System.out.println(alphabet.get(2));

        Iterator<String> iter=language.iterator();
        System.out.println("ArrayList ....");
        while (iter.hasNext()){
            String element= iter.next();
            System.out.println(element+":"+language.indexOf(element));
        }
// changing arraylist elements
        language.set(2,"cryptoc");
        System.out.println(language);
// remove from the arraylist
        language.remove(2);
        System.out.println("index two elements ara removed");

        String ele=language.remove(3);
        language.remove(ele);
        System.out.println("element tree is removed are ok?");
// iterrate over arraylist

        List<String>  animals=new ArrayList<>();
        animals.add("cow");
        animals.add("cat");
        animals.add("dog");
        animals.add("loin");
        animals.add("tiger");
        animals.add("ox");

        for (String animal : animals){
            System.out.println(animal);
        }

    }
}