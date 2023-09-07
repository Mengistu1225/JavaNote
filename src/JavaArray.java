

public class JavaArray {
    public static void main(String[] args) {
        // String[] array=new String[100];
        int[] ages={20,39,43,67,12,65,78,468};
        /*
        System.out.println(ages[1]);
        for (int i=0;i<=ages.length;i++){
            System.out.println(ages[i]);*/
        /*int[] age = {12, 4, 5};

        // loop through the array
        // using for loop
        System.out.println("Using for-each Loop:");
        for(int a : age) {
            System.out.println(a);
        }
       */

        int sum = 0;
        double average;

        for (int age : ages) {
            sum += age;
        }

        double array_length = ages.length;
        average = (double) sum / array_length;

        System.out.println("the sum of age is : "+sum);
        System.out.println("The average age is " + average);

    }
}
