public class Mobile {
    private String model;
    private Storage cellphoneStorage;

    public void set_Model(String cellphoneModel){
        model =  cellphoneModel;
    }

    public String get_Model(){
        return model;
    }


    public void set_cellphoneStorage(Storage s1){
        cellphoneStorage = s1;
    }

    public Storage get_cellphonStorage(){
        return cellphoneStorage;
    }

}
