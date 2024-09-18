public class Notebook {
    private String manufacturerName;
    private String madeIn;
//constructors
    Notebook(){
        this.manufacturerName = "noname";
        this.madeIn = "noname";
    }

    Notebook(String manufacturerName , String madeIn){
            this.manufacturerName = manufacturerName;
            this.madeIn = madeIn;

    }

    Notebook(Notebook n){
        this.manufacturerName = n.getManufacturerName();
        this.madeIn = n.getMadeIn();
    }

//setters and getters
    public void setManufacturerName(String manufacturerName){
        this.manufacturerName = manufacturerName;
    }
    public void setMadeIn(String madeIn){
        this.madeIn = madeIn;
        
    }


    public String getManufacturerName(){
        return manufacturerName;
    }
    public String getMadeIn(){
        return madeIn;
    }

    void display(){
        
       System.out.println(getManufacturerName());
        System.out.println(getMadeIn());  
    }

}
