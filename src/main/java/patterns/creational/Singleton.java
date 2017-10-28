package patterns.creational;

public class Singleton {

    private static Singleton instanse;

    private Singleton(){}

    public static synchronized Singleton getInstanse(){
        if(instanse==null){
            return new Singleton();
        }
        else{
            return instanse;
        }
    }
}
