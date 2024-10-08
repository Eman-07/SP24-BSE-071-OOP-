import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class Sms {
    private String receiverNumber;
    private String senderNumber;
    private String smsContent;
    private Boolean status;
    private LocalDate date;
    private LocalTime time;

    private String smsId;
    public static int smsIdCounter = 0;

    public Sms(String receiverNumber, String senderNumber, String smsContent, Boolean status) {

        this.setReceiverNumber(receiverNumber);
        this.setSenderNumber(senderNumber);
        this.setSmsContent(smsContent);
        this.setStatus(status);

        this.time = LocalTime.now();
        this.date = LocalDate.now();
        this.smsId = String.format("%03d" ,smsIdCounter++);
    }

    public Sms(){
        this("Unknown", "Unknown", "Unknown", true);
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
        if (status != null)
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
        return String.format("{SmsID : %s |  Sender Number : %s | Receiever Numeber : %s | Content : %-20s | Status : %b |  Sent Time : %02d:%02d:%02d:%02d Sent Date : %02d - %s - %04d}",smsId,senderNumber,receiverNumber,smsContent,status,time.getHour(),time.getMinute(),time.getSecond(),time.getNano(),date.getDayOfMonth(),date.getMonth(),date.getYear());
    }

    public static int smsCount(){
        return smsIdCounter;
    }

}
