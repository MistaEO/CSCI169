import java.util.Date;

class Fruit extends Food {
    private Date ripe;
    public Fruit(){
        ripe = new Date();
    }
    public Fruit(String n, Date r){
        super.name = n;
        ripe = r;
    }

    public void ripeTime(){
        
    }

    
}
