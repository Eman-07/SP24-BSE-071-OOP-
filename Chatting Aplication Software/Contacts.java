public class Contacts {
    private String name;
    private String phoneNumber;
    private String id;
    public static int contactIdCounter = 0;

    Contacts(String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
        this.id = String.format("%03d", contactIdCounter++);
    }

    Contacts(){
        this("Unknown", "Unknown");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null)
            this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("{id : %s \tName: %s, \tPhone: %s}",id , name, phoneNumber);
    }




}
