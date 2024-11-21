import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        System.out.println("---Sorted by id---");
        Product products[] = new Product[5];

        products[0] = new Product("Soap" , 500 , 100 , 4.5);
        products[1] = new Product("Keyboard" , 1500 , 50 , 5.0);
        products[2] = new Product("Pen" , 5000 , 80 , 4.1);
        products[3] = new Product("usb" , 50 , 110 , 4.3);
        products[4] = new Product("marker" , 900 , 90 , 4.2);

        Arrays.sort(products);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

Arrays.sort(products, products[0]);

        System.out.println("---Sorted by price---");


        try{
            for (int i = 0; i < products.length+1; i++) {
                System.out.println(products[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Program Ended");


        System.out.println(Arrays.binarySearch(products, products[0]));

        Arrays.binarySearch(products, new Product("Soap" , 500 , 100 , 4.5));

    }
}
