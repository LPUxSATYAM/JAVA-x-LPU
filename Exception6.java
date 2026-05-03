public class Exception6 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; 
            int arr[] = new int[3];
            arr[5] = 10;
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        }
    } 
}


//multiple catch blocks