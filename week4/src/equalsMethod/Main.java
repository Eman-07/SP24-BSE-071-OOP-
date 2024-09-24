package equalsMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Laptop l1 = new Laptop("HP","Victus93",2024);
        Laptop l2 = new Laptop("HP","Victus93",2024);

//        l2.setBrand("HP1");


        if (l1.equals(l2)){
            System.out.println("Laptop equals");
        }
        else {
            System.out.println("Laptop not equals");
        }




        l2.setReleasedYear(2022);
        Laptop l3 = l2.clone();//deep copy
        System.out.println(l3);

        l3.setReleasedYear(2021); //channing l3 will not affect l2

        System.out.println(l3.getReleasedYear());//2021
        System.out.println(l2.getReleasedYear());//2022

    }
}
