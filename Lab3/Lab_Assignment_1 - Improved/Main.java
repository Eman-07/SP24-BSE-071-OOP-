public class Main {

    public static void main(String[] args) {
        

        

        Artwork aw1 = new Artwork();

        System.out.println("For object created using no arument contructor");
        aw1.display();


      

        Artwork aw2 = new Artwork("Painting",2015);
        System.out.println("For object created using parameterized contructor with 2 args");
        aw2.display();
        
        
        Artwork aw3 = new Artwork("Sketch",2024,new Artist("Joshua"));
        System.out.println("For object created using parameterized contructor with 3 args");
        aw3.display();


        System.out.println("------------------------");
        System.out.println("Exihibiting shallow copy");
        System.out.println("------------------------");

        Artwork shcpy1 = new Artwork("Oil Painting" , 2023 , new Artist("Ali"));

        System.out.println("Deatails of Objects to be copied");
        shcpy1.display();

        Artwork shcpy2 = shcpy1.shallowCopy(shcpy1);

        System.out.println("Deatails of object whose arguments are copied from another object");
        shcpy2.display();
        

        System.out.println("Changing Name in one object");
        shcpy2.getArtist().setName("Eman");

        System.out.println("Printing Both objects");
        shcpy1.display();
        shcpy2.display();

        System.out.println("Note that Name changed in copied object affects other object");
    }
    
}
