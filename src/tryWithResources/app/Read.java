package tryWithResources.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {

//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(
//                    new FileReader("readme.mdf")
//            );
//            while (true){
//                String text = reader.readLine();
//                if (text == null){
//                    break;
//                }
//                System.out.println(text);
//            }
//        } catch (IOException exception){
//        // exception.printStackTrace();
//        } finally {
//            if (reader != null){
//                try {
//                    reader.close();
//                    System.out.println("success menutup");
//                } catch (IOException exception){
//                    System.out.println("errpr menutup resource " + exception);
//                }
//            }
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader("readme.md"))){
            while (true){
                String text = reader.readLine();
                if (text == null){
                    break;
                }
                System.out.println(text);
            }
        }  catch (IOException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("selamat");
        }

    }
}
