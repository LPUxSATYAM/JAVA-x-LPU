public class Exception3 {
    public static void main(String[] args){
        try {

             int [] arr = new int[3];
            arr[5] = 10;

            

            int a = 10 / 0;
           
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
