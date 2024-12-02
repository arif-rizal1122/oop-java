package error.app;

// error adalah exception yg tidak direkomendasikan kecuali pada keadan tertentu

import error.error.DatabaseError;

public class App {
    public static void main(String[] args) {

        connectDatabase("admin", "buka");
        // tidak dissarankan di try catch
        System.out.println("sucess");
    }
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("tidak bisa connect ke database");
        }
    }
}
