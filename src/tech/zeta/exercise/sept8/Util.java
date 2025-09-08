package tech.zeta.exercise.sept8;

public class Util{

    public static<T> void display(Iterable<T> list){

        for(T listItem: list){
            System.out.print(listItem + " ");
        }
        System.out.println();
    }

    public static void LineBreak(){
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
    }

}
