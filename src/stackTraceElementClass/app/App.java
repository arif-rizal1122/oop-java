package stackTraceElementClass.app;



public class App {
    public static void main(String[] args) {

        try {
            String[] names = {
                    "arif", "rizal", "sos"
            };
            System.out.println(names[19]); // Index 100 out of bounds for length 3
        } catch (Throwable throwable){
            StackTraceElement[] stackTraceElements =throwable.getStackTrace();
            throwable.printStackTrace();
        }

    }
}
