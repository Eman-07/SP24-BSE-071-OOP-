import java.time.LocalDateTime;
import java.util.Scanner;

public class Chat {


    private Sms messages[];
    public static int messageCounter = 0;

    Chat(){

    }

    {
        messages = new Sms[10];
        //dummy messages
        messages[messageCounter++] = new Sms("111","222","Hello",true);
        messages[messageCounter++] = new Sms("123","951","Good Morning",false);
        messages[messageCounter++] = new Sms("789","753","Welcome",true);
        messages[messageCounter++] = new Sms("154","149","😂",false);
        messages[messageCounter++] = new Sms("485","941","😎cool",false);
    }

    public void sendMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sender Number: ");
        String snumber = sc.nextLine();
        System.out.println("Enter receiver Number: ");
        String rnumber = sc.nextLine();
        System.out.println("Enter message content: ");
        String message = sc.nextLine();

        messages[messageCounter++] = new Sms(snumber,rnumber,message,true);



    }
    public void displayChat(){
        System.out.println("unsorted");
        for (int i = 0; i <messageCounter; i++) {
            System.out.println(messages[i]);
        }

           }
}

