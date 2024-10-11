import java.time.LocalTime;
import java.time.LocalDate;

public class Sms {
    private String receiverNumber;
    private String senderNumber;
    private String smsContent;
    private Boolean status;
    private LocalDate date;
    private LocalTime time;
    private Boolean type; //sent or received

    private String smsId;
    public static int smsIdCounter = 0;

    public Sms(String receiverNumber, String senderNumber, String smsContent, Boolean status,Boolean type) {

        this.setReceiverNumber(receiverNumber);
        this.setSenderNumber(senderNumber);
        this.setSmsContent(smsContent);
        this.setStatus(status);
        this.setType(type);

        this.time = LocalTime.now();
        this.date = LocalDate.now();
        this.smsId = String.format("%03d" ,smsIdCounter++);
    }

    public Sms(){
        this("Unknown", "Unknown", "blank", true,null);
    }


    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        if (receiverNumber != null)
            this.receiverNumber = receiverNumber;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setType(Boolean type){
            this.type = type;
    }

    public Boolean getType(){
        return type;
    }

    public void setSenderNumber(String senderNumber) {
        if (senderNumber != null)
            this.senderNumber = senderNumber;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        if (smsContent != null)
            this.smsContent = smsContent;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
            this.status = status;
    }


    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("{SmsID : %s |  Sender Number : %s | Receiever Numeber : %s | Content : %-20s | Status : %b |  Sent Time : %02d:%02d:%02d Sent Date : %02d - %s - %04d}",smsId,senderNumber,receiverNumber,smsContent,status,time.getHour(),time.getMinute(),time.getSecond(),date.getDayOfMonth(),date.getMonth(),date.getYear());
    }

    public void display(){
            String st; //status
            if (getStatus() == true) {
                st = "seen";
            }
            else
                st = "unseen";

            String type ;

            if (getType()) {
                type = "Sent";
            }
            else
                type = "received";
            System.out.printf("%-15s [%02d:%02d:%02d] -%s *%s\n",smsContent,time.getHour(),time.getMinute(),time.getSecond(),st,type);
    }
    public static int smsCount(){
        return smsIdCounter;
    }


    public static void sorter(Sms[] messages){


        // System.out.println("sorted");
        System.out.println("Chat:");
        int n = messages.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (messages[j].getTime().isAfter(messages[j + 1].getTime())) {

                    Sms temp = messages[j];
                    messages[j] = messages[j + 1];
                    messages[j + 1] = temp;
            }
        }
    }

    for (int i = 0; i < messages.length; i++) {
            messages[i].display();
    }

        // return messages;
    }

}
