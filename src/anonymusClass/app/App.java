package anonymusClass.app;

import anonymusClass.person.HelloWorld;

public class App {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void sayHello(){
                System.out.println("Hello : ");
            }
            @Override
            public void sayHello(String name){
                System.out.println("Hello : " + name);
            }
        };
        helloWorld.sayHello();
        helloWorld.sayHello("hy arif");


    }
}
