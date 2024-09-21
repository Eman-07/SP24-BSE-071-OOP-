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


        System.out.println("Deatails of 1st Objects whose arguments are copied to 2nd object");
        shcpy1.display();

        Artwork shcpy2 = shcpy1.shallowCopy(shcpy1);

        System.out.println("Deatails of 2nd object whose arguments are copied from another object");
        shcpy2.display();
        

        System.out.println("Changing Name in 2nd object");
        shcpy2.getArtist().setName("Eman");

        System.out.println("Printing Both objects");
        shcpy1.display();
        shcpy2.display();

        System.out.println("Note that Name changed in 2nd object affects other object");

        System.out.println("------------------------");
        System.out.println("Exihibiting Deep copy");
        System.out.println("------------------------");


        Artwork dpcpy1 = new Artwork("Peace",2021 , new Artist("Kim Jong Un"));
        System.out.println("Deatails of 1st Objects whose arguments are copied to 2nd object");
        dpcpy1.display();



        Artwork dpcpy2 = dpcpy1.deepCopy(dpcpy1);
        System.out.println("Deatails of 2nd object whose arguments are copied from another object");
        dpcpy2.display();

        System.out.println("Changing details in 2nd object");
        dpcpy2.getArtist().setName("Viladimir Putin");
        dpcpy2.setTitle("War");

        System.out.println("1st object");
        dpcpy1.display();
        System.out.println("2nd object");
        dpcpy2.display();

        System.out.println("See that change in Name of 2nd object did'nt affect 1st obect");


    }
    
}
