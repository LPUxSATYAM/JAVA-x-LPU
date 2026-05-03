class Main {
        int function(){
        try {
            return 10;
        }
         finally {
            return 20;
        }
        }
}

public class Exception4{
        public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.function());
    }
}


//try - catch - finally
