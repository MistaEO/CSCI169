
import java.util.Date;

public class Orange extends Fruit{
    public Orange(){
        super.name = "orange";
        super.ripe = new Date();
    }
    public Orange(Date r){
        super.name = "orange";
        super.ripe = r;
    }
    public void prepare(){
        System.out.println("Peel the " + super.name);
    }
    
}
