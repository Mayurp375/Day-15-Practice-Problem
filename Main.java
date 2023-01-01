package classProblemByAmolMateSir.Day15PracticeProblem;


import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to hashTable");
        String myString = "To be or not to be";

        myString.trim();//remove space
        String[] words = myString.toLowerCase().split(" ");
        Hashtable<String, Integer> string = new Hashtable<>();
        for (String word : words) {
            Integer value = MyHashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            System.out.println(value);
        }

    }
}
