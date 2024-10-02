public class Main {

    public static void main(String[] args) {
        Seat s[][] = new Seat[2][];

        for (int i = 0; i < s.length; i++) {
            s[i] = new Seat[i+4];
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = new Seat();
                System.out.println(s[i][j]);
            }
        }
    }
}
