import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);


        String name;
        int age;

        System.out.print("Enter Name : ");
        name = ip.nextLine();

        System.out.print("Enter Age : ");
        age = ip.nextInt();



        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}