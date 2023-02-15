package Collection;

import java.util.*;
import java.util.stream.Stream;

public class COLLECTION{
 public static void main(String args[]){

    /*
     Collection is an interface which is implemented by class ArrayList.
     This arraylist can be of any type. Int,String etc.
     To define a generic type we use <> and provide wrapper class name in <>
     <Integer>.

     So if we not provide <Integer> , the values becomes object for the arraylist. Because
     all classes Integer,String extends Object class.
     */

    Collection<Integer> nums = new ArrayList<Integer>(); // No indexing is provided for arraylist if using collection
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);

    System.out.println(nums);

    for(int i: nums){
        System.out.println(i);
    }

    List<Integer> nums1 = new ArrayList<Integer>(); //indexing is provided for arraylist if using List
    nums1.add(10);
    nums1.add(20);
    nums1.add(30);
    nums1.add(40);

    System.out.println(nums1.get(0));

    Set<Integer> nums2 = new HashSet<Integer>(); 
    nums2.add(10);
    nums2.add(20);
    nums2.add(30);
    nums2.add(40);
    nums2.add(10);

    System.out.println(nums2); // No indexing , unique values but not in given order, random order.

    Set<Integer> nums3 = new TreeSet<Integer>(); 
    nums3.add(10);
    nums3.add(20);
    nums3.add(30);
    nums3.add(40);
    nums3.add(10);

    System.out.println(nums3); // No indexing , unique values but in sorted order.

    // Iterator is a parent interface of Collections

    Iterator<Integer> values = nums3.iterator();
    while(values.hasNext()){
        System.out.println(values.next());
    }

    List<Integer> SortArr = new ArrayList<>(); // Same as List<Integer> SortArr = new ArrayList<Integer>(); second <> type is optional.
    SortArr.add(10);
    SortArr.add(5);
    SortArr.add(1);
    SortArr.add(100);
    SortArr.add(0);

    Collections.sort(SortArr); // Collections class and not collection framework
    System.out.println(SortArr);

    /*
     Suppose we want custome sorting by just sorting based on last digit of number.
     [31,12,14]

     To such custom sorting we need use Comparator. Now the comparator is a functional interface with method compare.
     */

     Comparator <Integer> comp = new Comparator<Integer>() {

        public int compare(Integer i, Integer j){
            if(i%10>j%10) return 1;
            return -1;
        }
        
     };

     Collections.sort(SortArr,comp); // Custom sorting
     System.out.println(SortArr);


     // Sorting students data based on age
     Comparator<Students> StudComp = new Comparator<Students>() {
        public int compare(Students age1,Students age2){
            if(age1.age>age2.age){
                return 1;
            }
            else{
                return -1;
            }
        }
     };
     List<Students> studArr = new ArrayList<>();
     studArr.add(new Students(12,"Harsh"));
     studArr.add(new Students(10,"Meet"));
     studArr.add(new Students(14,"Jimit"));
     studArr.add(new Students(9,"Raj"));

    for(Students s: studArr){
        System.out.println(s.toString());
    }

    Collections.sort(studArr,StudComp);

    System.out.println("Sorting based on Age using Comparator Interface");
    for(Students s: studArr){
        System.out.println(s.toString());
    }

    System.out.println("Sorting based on Comparable Interface");
    Collections.sort(studArr); // To sort students we need to use Comparable Interface. In integer class , there is a comparable class which compares integer in JAVA.
    // Comparable provides the power to compare its own object of a class.


    List<Integer> arr =Arrays.asList(1,2,3,4,5);
    arr.forEach(n -> System.out.println(n));

    // Stream
    /*
     It creates a copy of data in the stream object and this object can be used with only one operation.
     */

    Stream<Integer> st = arr.stream();

    st.forEach(n -> System.out.println(n));
    // stream.forEach(n -> System.out.println(n)); // Cannot be used stream object again 

    List<Integer> newarr =Arrays.asList(1,2,3,4,5);

    Stream<Integer> result = newarr.stream().filter(n->n%2==0).map(n->n*2);
    System.out.println(result);  

 }   
}

class Students implements Comparable<Students>{
    int age;
    String name;
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Students that){
        if(this.age > that.age) return 1;
        return -1;
    }
}