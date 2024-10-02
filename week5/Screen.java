public class Screen {
    private String screenType;
    private String screenId;
    private Seat seats[][];


    {
        seats = new Seat[5][5];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat();
            }
        }

    }

    public Screen(String screenType, String screenId) {
        this.screenType = screenType;
        this.screenId = screenId;
    }


    public void displaySeats(){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.println(seats[i][j]);
            }
        }
    }

}
