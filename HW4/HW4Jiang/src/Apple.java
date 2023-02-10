
import java.util.Date;

public class Apple extends Fruit{
    public Apple(){
        super.name = "apple";
        super.ripe = new Date();
    }
    public Apple(Date r){
        super.name = "apple";
        super.ripe = r;
    }

    public void prepare(){
        System.out.println("Core the "+ super.name);
    }
}
