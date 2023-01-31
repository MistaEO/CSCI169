public class Seafood extends Food{
    public Seafood(){
        super.name = "seafood";
    }
    public Seafood(String n){
        super.name = n;
    }

    public void prepare(){
        System.out.println("Peel the " + super.name);
    }
    
}
