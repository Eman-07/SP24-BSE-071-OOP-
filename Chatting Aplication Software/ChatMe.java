import java.util.Scanner;
// import java.util.Arrays;

public class ChatMe {
    private Sms[] allSms = new Sms[1000]; 
    private Contacts[] contactList = new Contacts[100];
    
    private String senderNumber;
    private String senderName;

    // private Sms[] chatContent = new Sms[100]; //to store chat for sorting purposes

    public static int contactCount;
    public static int allSmsCounter;


    {
        // dummy contacts
        contactList[contactCount++] = new Contacts("john", "+4515484841");
        contactList[contactCount++] = new Contacts("smith", "+5548748999");
        contactList[contactCount++] = new Contacts("ramos", "+38974196148");
        contactList[contactCount++] = new Contacts("ali", "+44799491123");


        //dummy  sms
        allSms[allSmsCounter++] = new Sms("+4515484841", "+4578988844" ,"hi 1",false,true );
        allSms[allSmsCounter++] = new Sms("+5548748999", "+4578988844" ,"hi 2",false,true );
        allSms[allSmsCounter++] = new Sms("+38974196148", "+4578988844" ,"hi 3",false,true );
        allSms[allSmsCounter++] = new Sms("+44799491123", "+4578988844" ,"hi 4",false,true );
    }


    ChatMe() {
        // allSms = new Sms[100];

    }
    //setters getters
    public void setSenderName(String senderName){
        this.senderName = senderName;
    }
    public String getSenderName(){
        return senderName;
    }

    public void setSenderNumber(String senderNumber){
        this.senderNumber = senderNumber;
    }

    public String getSenderNumber(){
        return senderNumber;
    }


    // the chat system



    public void sendMessage(String name,int contactIndex) {
        Scanner sc = new Scanner(System.in);
        String receiverNum = getContactNumberWithName(name);
        System.out.println("Sending Messages to " + name +"("+ receiverNum+ ")");
            System.out.printf("Type message and press Enter to Send messages\nEnter \"//\" to Stop Sending Messages\n" );
            String content;
            content = null ;
            
            do{
                System.out.printf("Enter your message : ");
                content = sc.nextLine();
                if (content.equals("//")) {
                    break;
                }
                allSms[allSmsCounter++] = new Sms(receiverNum,senderNumber,content,false,true);
                System.out.println("Message Sent successfully");

            }while(!content.equals("//"));
            System.out.println("Exiting Send message menu");

    }

    public void viewUnreadMessages(String receiverName) {
    
        System.out.println("Reading All Chat with " +receiverName);
        System.out.println("");
        String receiverNumber = getContactNumberWithName(receiverName);
        System.out.println("-----------------------");
        System.out.println("Name : "+ receiverName+"\nNumber : "  + receiverNumber);
        System.out.println("-----------------------");

        int chatContentCounter = 0;

        int status = 0;
        for (int i = 0; i < allSmsCounter; i++) {
                if (allSms[i].getReceiverNumber().equals(receiverNumber) && allSms[i].getStatus() == false){
                    allSms[i].setStatus(true);
                    chatContentCounter++;
                    status = 1;
                    // System.out.println(chatContentCounter);
                }

            }
            Sms[] chatContent = new Sms[chatContentCounter];

            if (status == 1) {
            int counter = 0;
        for (int i = 0; i <allSmsCounter; i++) {
            if (allSms[i].getReceiverNumber().equals(receiverNumber)) {
                chatContent[counter++] = allSms[i];
                // System.out.println("check"+i);
            }
        }
            Sms.sorter(chatContent);
      
    }

      System.out.println("-------------------------------------");

    }


    public void deleteMessage(){
        System.out.println("In delete messages menu");
        System.out.println("These are messages in DataBase : ");

        for (int i = 0; i < allSmsCounter; i++) {
            System.out.printf("%d : ",i);
            System.out.println(allSms[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Respective index to delete Sms\n Enter : ");
        int index = sc.nextInt();

        Sms[] temp = new Sms[100];
        temp = allSms;
        allSms[index] = null;

        for (int i = 0; i < index; i++) {
            allSms[i] = temp[i];
        }
        for (int j = index; j < allSmsCounter; j++) {
            allSms[j] = temp[j+1];
        }

        allSmsCounter--;
        temp = null;

        System.out.println("Message Deleted Successfully");
    }

    public void chatOverview(String receiverName) {

        System.out.println("Reading All Chat with " +receiverName);
        System.out.println("This will not change the status of messages because you are reading messages from sender pov");
        String receiverNumber = getContactNumberWithName(receiverName);
        System.out.println("-----------------------");
        System.out.println("Name : "+ receiverName+"\nNumber : "  + receiverNumber);
        System.out.println("-----------------------");

        int chatContentCounter = 0;
        for (int i = 0; i < allSmsCounter; i++) {
                if (allSms[i].getReceiverNumber().equals(receiverNumber)){
                    chatContentCounter++;
                    // System.out.println(chatContentCounter);
                }

            }
            Sms[] chatContent = new Sms[chatContentCounter];

            int counter = 0;
        for (int i = 0; i <allSmsCounter; i++) {
            if (allSms[i].getReceiverNumber().equals(receiverNumber)) {
                chatContent[counter++] = allSms[i];
                // System.out.println("check"+i);
            }
        }

            Sms.sorter(chatContent);
            chatContent = null;
        
      System.out.println("-------------------------------------");

    }




    // Methods for contacts

    public void manageContacts(){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 1 to add new contact\nEnter 2 to find Contact\nEnter 3 delete Contact\nEnter 4 to display all contacts\nEnter 0 to exit\nChoice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.out.println("opening main menu");
                break;
            case 1:
                addContact();
                break;

                case 2:
                    findContact();
                    break;
                    case 3:
                        deleteContact();
                        break;
                        case 4:
                            displayContacts();
                            break;
                            default:
                                System.out.println("Invalid choice");
                                break;

        }
    }
    public void addContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adding a new contact");
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Phone number");
        String phone = sc.nextLine();

        contactList[contactCount++] = new Contacts(name, phone);
        System.out.println("Contact Added");
        sc.close();
    }

    public boolean findContactWithName(String name) {
        for (int i = 0; i < contactCount; i++) {
            if (contactList[i].getName().equals(name)) {
                System.out.println(contactList[i]);
                return true;
            }
        }
        return false;

    }

    public int getContactIndexWithName(String name){
        int found = 0;
        int i;
        for (i = 0; i < contactCount && found == 0; i++) {
            if (contactList[i].getName().equals(name)) {
                found = 1;
            }
        }
        return i-1;
    }

    public String getContactNumberWithName(String name){
        String number = new String();
        int found = 0;
        for (int i = 0; i < contactCount && found == 0; i++) {
            if (contactList[i].getName().equals(name)) {
                number = contactList[i].getPhoneNumber();
                found = 1;
            }
        }
        return number;
    }

    public void findContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        boolean found = findContactWithName(name);
        if (found) {
            System.out.println("Contact Found");
        } else {
            System.out.println("Contact Not Found");
        }
        sc.close();
    }

    public void deleteContact() {
        System.out.println("Contact count : " + contactCount);

        System.out.println("Delete Contact Menu");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Do you want to see the list of name in contacts? Enter 1 for YES & Any other for NO\nChoice : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            for (int i = 0; i < contactCount; i++) {
                System.out.printf("%d : %s\n", i + 1, contactList[i].getName());
            }
        }

        sc.nextLine();
        System.out.println("Enter the name of the contact you want to Delete : ");
        String name = sc.nextLine();
        if (findContactWithName(name)) {
            System.out.println("Contact Found");

            // now creating a temporary array to store contact in order to get rid of
            // deleted contact
            Contacts temp[] = new Contacts[--contactCount];
            for (int j = 0; j < contactCount; j++) {
                temp[j] = contactList[j];

            }

            int i, found;
            found = 0; // means contact is still not found

            for (i = 0; i < contactCount && found == 0; i++) { // this for loop is to locate the index/id of contact to
                                                               // be deleted
                if (contactList[i].getName().equals(name)) {
                    found = 1;
                    break;
                }
            }
            System.out.println("i : " + i);

            System.out.println("Contact count : " + contactCount);

            // suppose that the contact you want to delete is at index 2 in contactList[]
            for (int j = 0; j < i; j++) { // this for loop stores the contacts before index 2
                contactList[j] = temp[j];
            }
            for (int j = i; j < contactCount; j++) { // this for loop stores the contacts after index 2
                contactList[j] = contactList[j + 1];
            }

        } else {
            System.out.println("Contact not found !!!");
        }

        sc.close();

    }

    public void displayContacts() {
        for (int i = 0; i < contactCount; i++) {
            System.out.println(contactList[i]);
        }
    }

    public String getContactForChat() {
        System.out.println("Choose the contact to start chat with");
        for (int i = 0; i < contactCount; i++) {
            System.out.printf("%d %s\n", i + 1, contactList[i].getName());
        }

        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter Name : ");
        String name = sc.nextLine();

       if( findContactWithName(name)){
           System.out.println("Chat started with " + name);
       }
       else
       {
           System.out.println("Contact Not Found");
           System.out.println("Enter Again");
           getContactForChat();
       }
       return name;
    }


}
