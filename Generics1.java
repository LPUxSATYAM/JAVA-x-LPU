import java.util.ArrayList;

/* 
class ArrayList<E>{

}
*/

// public class Generics1{
//     public static void main(String[] args) {
//         ArrayList list = new ArrayList(); // Object  - Type parameter
//         list.add("Java");
//         list.add(100);

//         int str = (Integer)list.get(1); // returns Object type
//         //Object -> String (X)     - ClassCastException   - RUNTIME
//         System.out.println(str);
//     }
// }

/*

int val = list.get(1); 
String s = Integer.toString(val);
System.out.println(s);

*/




public class Generics1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add(100);  // Compile time error

        String str = list.get(0);
    }
}



