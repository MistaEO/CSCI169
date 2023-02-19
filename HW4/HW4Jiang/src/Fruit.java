import java.util.Date;

public class Fruit extends Food implements Comparable<Object>{
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

    public Date getRipe(){
        return ripe;
    }

    /*public int compareTo(Fruit f){
        if (ripe == f.ripe){
            return 0;
        }else if(ripe.compareTo(f.ripe) == -1){
            return -1;
        }else{
            return 1;
        }
    }
    */
    public int compareTo(Object f){
        Fruit f = Fruit(Object f)
        return this.ripe.compareTo(f.getRipe());
    }
    
}
