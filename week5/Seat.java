public class Seat {
    private int id;
    private String seatType;
    private boolean isReserved;
    private double price;
    public static int counter;


    public Seat(int id, String seatType, boolean isReserved, double price) {
        this.id = id;
        this.seatType = seatType;
        this.isReserved = isReserved;
        this.price = price;
    }
    public Seat(){
        this.id = 0;
        this.seatType = "none";
        this.isReserved = false;
        this.price = 10;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        counter++ ;
        return String.format("%d: {id : %s | Type : %s | Price : %.2f$ | Reserved : %b} }", counter,id, seatType, price, isReserved);
    }
}
