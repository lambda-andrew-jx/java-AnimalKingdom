package animalkingdom;

public class Main {
    public static void main(String[] args) {
        
       Mammals koala = new Mammals(40, "koala", 1869);
       Birds pidgeon = new Birds(10, "pidgey", 20);
       System.out.println("*** koala ***");
       System.out.println(koala.move("walking \n"));  
        System.out.println(pidgeon.move(pidgeon.getName()+" wings \n"));
       
       
    }
}