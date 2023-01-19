package Singleton;

public class aplicacion {
    private static aplicacion Aplicacion;
    boolean isrunning = false;

    private aplicacion(){}

    public static aplicacion getInstance(){
        if(Aplicacion == null){
            Aplicacion = new aplicacion();
        }
        return Aplicacion;
    }


    public void run (){
        if(!isrunning) {
            System.out.println("encendiendo");
            isrunning = true;
        }else {
            System.out.println("ya estaba en ejecucion");
        }
    }
}
