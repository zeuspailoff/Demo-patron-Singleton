package Singleton;

public class Main {
    public static void main(String[] args) {

       Singleton singleton = Singleton.getInstance();
       singleton.setContador(15);

       Singleton singleton1 =Singleton.getInstance();


        System.out.println("valor: " + singleton.getContador() + " en memoria: " + singleton);
        System.out.println("valor: " + singleton1.getContador() + " en memoria: " + singleton1);

        aplicacion app = aplicacion.getInstance();
        aplicacion app2 = aplicacion.getInstance();

        app.run();
        app2.run();
        System.out.println( app + " "+ app2);

    }
}