class Food {
    protected String name;
    
    public Food(){
        name ="";
    }

    public Food(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void prepare(){
        System.out.println("Food has been prepared.");
    }
}
