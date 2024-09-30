import java.util.Scanner;
//import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Shop s1 = new Shop("Abc" , "Lahore", new Person("Ali" , "Ali@gmail.com"));
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("_______________________________________");
            System.out.println("___Main Menu___");
            System.out.printf("Enter 1 to view all products in shop\nEnter 2 to add product\nEnter 3 to Search product\nEnter 4 to delete product\nEnter 5 to modify product\nEnter 6 to sale product \nEnter 7 to view Revenue\nEnter 0 to exit\n Selection : ");
            choice = sc.nextInt();

            System.out.println("_______________________________________");


            switch (choice){

                case 1:
                    System.out.println("Products in Shop:");
                    s1.displayAllProducts();
                    break;
                case 2:
                    System.out.println("Add Product Menu");
                    s1.addProduct();
                    break;
                case 3:
                    System.out.println("Search Product Menu");
                    s1.searchProduct();
                    break;
                case 4:
                    System.out.println("In delete Product Menu");
                    s1.removeProduct();
                    break;
                case 5:
                    System.out.println("Modify Product Menu");
                    s1.modifyProduct();
                    break;
                case 6:
                    System.out.println("Sale Product Menu");
                    s1.saleProduct();
                    break;

                case 7:
                    System.out.println("View Revenue");
                    s1.viewRevenue();
                    break;
                case 0:
                        break;
                    default:
                        System.out.println("Invalid choice");
            }



        }while(choice != 0);
        System.out.println("Thanks for using");


        }


}
