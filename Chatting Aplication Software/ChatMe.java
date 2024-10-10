import java.util.Scanner;
// import java.util.Arrays;


public class ChatMe{
    private Sms[][] messageList;
    private Contacts[] contactList = new Contacts[100];

    public static int contactCount;

    {
            //dummy contacts
        contactList[contactCount++] = new Contacts("john", "+4515484841");
        contactList[contactCount++] = new Contacts("smith", "+5548748999");
        contactList[contactCount++] = new Contacts("ramos", "+38974196148");
        contactList[contactCount++] = new Contacts("Ali", "+44799491123");
    }

    ChatMe(){
        messageList = new Sms[100][100];
    }






    //Methods for contacts
    public void addContact(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Adding a new contact");
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Phone number");
        String phone = sc.nextLine();

         contactList[contactCount++]= new Contacts(name, phone);
         sc.close();
    }


    public boolean findContactWithName(String name){
        for (int i = 0; i < contactCount; i++) {
            if (contactList[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
       
    }


    public void findContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        boolean found = findContactWithName(name);
        if (found) {
            System.out.println("Contact Found");
        }
        else {
            System.out.println("Contact Not Found");
        }
        sc.close();
    }

    public void deleteContact(){
        System.out.println("Contact count : " +contactCount );

        System.out.println("Delete Contact Menu");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Do you want to see the list of name in contacts? Enter 1 for YES & Any other for NO\nChoice : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            for (int i = 0; i < contactCount; i++) {
                System.out.printf("%d : %s\n" , i+1 , contactList[i].getName());
            }
        }
    
        sc.nextLine();
        System.out.println("Enter the name of the contact you want to Delete : ");
        String name = sc.nextLine();
        if (findContactWithName(name)) {
            System.out.println("Contact Found");

            //now creating a temporary array to store contact in order to get rid of deleted contact
            Contacts temp[] = new Contacts[--contactCount];
            for (int j = 0; j < contactCount; j++) {
                temp[j] = contactList[j];
                
            }

            int i,found;
            found = 0; //means contact is still not found

            for( i = 0 ;i < contactCount && found == 0 ; i++){ //this for loop is to locate the index/id of contact to be deleted
                if (contactList[i].getName().equals(name)) {
                    found = 1;
                    break;
                }
            }
            System.out.println("i : "+ i);


            System.out.println("Contact count : "+contactCount);


            //suppose that the contact you want to delete is at index 2 in contactList[]
            for (int j = 0; j < i; j++) { //this for loop stores the contacts before index 2
            contactList[j] = temp[j];
            }
            for (int j = i; j < contactCount; j++) { //this for loop stores the contacts after index 2
                contactList[j] = contactList[j + 1];                
            }
            
        }
        else
        {
            // System.out.println(name);
            System.out.println("Contact not found !!!");
        }


        sc.close();

    }


    public void displayContacts(){
        for (int i = 0; i < contactCount; i++) {
            System.out.println(contactList[i]);
        }
    }

    public void checkTest(){
       System.out.println("Check");
            for (int i = 0; i < contactCount; i++) {
                    System.out.println(contactList[i]);
            }
        }
    }

