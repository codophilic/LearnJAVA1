package Collection;

import java.util.HashMap;
import java.util.Map;

public class MAPS {
    public static void main(String args[]){
        Map<String,Integer> students = new HashMap<String,Integer>(); // There is same method name HashTable which is synchronized to threads.

        students.put("Harsh", 56);
        students.put("Meet", 65);

        System.out.println(students);  // Unique and random order
        System.out.println(students.get("Harsh"));
        System.out.println(students.values());
        System.out.println(students.keySet());

        for(String name: students.keySet()){
            System.out.println(name+": "+students.get(name));
        }



    }
}
