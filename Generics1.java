import java.util.ArrayList;


public class Generics1{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(100);

        String str = (String) list.get(1);
    }
}




// public class Generics1{
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Java");
//         list.add(100); 

//         String str = list.get(0);
//     }
// }



