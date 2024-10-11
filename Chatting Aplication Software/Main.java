import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ChatMe chat1 = new ChatMe();


        Scanner ip = new Scanner(System.in);
        System.out.println("Welcome to ChatMe application");
        System.out.println("Please Enter your Name : ");
        String senderName = ip.nextLine();
        System.out.println("Please Enter your Number : ");
        String senderNumber = ip.nextLine();

        chat1.setSenderName(senderName);
        chat1.setSenderNumber(senderNumber);





    int choice;
        do {
            System.out.printf("---ChatMe---\nEnter 1 to Manage Contacts\nEnter 2 to chat\nEnter 3 to Exit the Program\n Choice : ");
            choice =  ip.nextInt();

            if (choice == 1) {
                chat1.manageContacts();
            } else if (choice == 2) {
                int choice3;
                do {

                    System.out.println("These are the contacts in System");
                    String contactName = chat1.getContactForChat();

                    System.out.printf("Enter 1 to view chat\nEnter 2 to send message\nEnter 3 to view Unread Messages \nEnter 4 to Delete Messages \nChoice : ");
                    int choice2 = ip.nextInt();
                    switch (choice2) {
                        case 1:
                            chat1.chatOverview(contactName);
                            break;
                        case 2:
                            chat1.sendMessage(contactName, chat1.getContactIndexWithName(contactName));
                            break;
                        case 3:
                            chat1.viewUnreadMessages(contactName);
                            break;

                        case 4:
                            chat1.deleteMessage();
                            break;
                        default:
                            System.out.println("Wrong Choice");
                            break;
                    }

                    System.out.printf("Do you want to use Chats again? Enter 1 for Yes and 0 for no\n Choice : ");
                    choice3 = ip.nextInt();

                } while (choice3 != 0);

            } else if (choice == 3) {
                System.out.println("Exiting...");

            }
            else
                System.out.println("Wrong Choice");
            System.out.printf("Enter 0 to Quit and anything else to reuse\n Choice : ");
            choice = ip.nextInt();
        }while(choice != 0);
        System.out.println("_Exited_");
 
    }
}
