import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        Product p1 = new Product("Apple" , 50 , 50);
//        System.out.println(p1);

        Shop s1 = new Shop("Abc" , "Lahore", new Person("Ali" , "Ali@gmail.com"));
        System.out.println(s1);
//        s1.addProduct();
//        s1.displayAllProducts();
//    }
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.printf("Enter 1 to view all products in shop\nEnter 2 to add product\nEnter 3 to Search product\nEnter 4 to delete product\nEnter 0 to exit\n Selection : $");
            choice = sc.nextInt();

            switch (choice){

                case 1:
                    s1.displayAllProducts();
                    break;
                case 2:
                    System.out.println("Add Product Menu");
                    s1.addProduct();
                    break;
                case 3:
                    System.out.println("Search Product Menu");
                    break;
                case 4:
                    System.out.println("In delete Product Menu");
                    s1.removeProduct();
                    break;
                case 0:
                        break;
                    default:
                        System.out.println("Invalid choice");
            }



        }while(choice != 0);


//        Shop s2 = new Shop();


        }


}
