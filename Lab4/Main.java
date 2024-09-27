import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shop s1 = new Shop("Abc" , "Lahore" , new Person("Ali","ali@abc.com"));

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter 1 to add product\nEnter 2 to Delete Product\nEnter 3 to Update Product\nEnter 4 to View product\nEnter 0 to Exit\n");

        System.out.printf("Enter your choice : ");
        int choice = sc.nextInt();

       do{
            switch (choice) {

                case 1:
                    s1.addProduct();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("Enter product id to view product : ");
                    s1.viewProduct(sc.nextInt());
                    break;
                case 5:
                    System.exit(1);
            }

           System.out.printf("Enter 1 to add product\nEnter 2 to Delete Product\nEnter 3 to Update Product\nEnter 4 to View product\nEnter 0 to Exit\n");
           System.out.printf("Enter your choice : ");
           choice = sc.nextInt();
        }while(choice != 0);
    }
}
