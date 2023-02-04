import java.util.Date;

public class Fruit extends Food {
    protected Date ripe;
    public Fruit(){
        super.name = "Fruit";
        ripe = new Date();
    }
    public Fruit(String n, Date r){
        super.name = n;
        ripe = r;
    }

    public void ripeTime(){
        System.out.println("You can eat it on " + ripe);
    }

    
}
