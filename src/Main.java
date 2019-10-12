import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{

        FileReader fileReader1 = new FileReader("car1.txt");
        Scanner scanner1 = new Scanner(fileReader1);
        ArrayList<String> strings = new ArrayList<String>();
        while (scanner1.hasNextLine()){
            strings.add(scanner1.nextLine());
        }
        CarCatalog carCatalog = new CarCatalog();
        carCatalog.addCar(strings.get(0), strings.get(1), strings.get(2), strings.get(3), strings.get(4), Double.parseDouble(strings.get(5)), Integer.parseInt(strings.get(6)));
        fileReader1.close();

        FileReader fileReader2 = new FileReader("customer1.txt");
        Scanner scanner2 = new Scanner(fileReader2);
        strings.clear();
        while (scanner2.hasNextLine()){
            strings.add(scanner2.nextLine());
        }
        Customer customer1 = new Customer(strings.get(0), strings.get(1), strings.get(2), strings.get(3), strings.get(4), strings.get(5), Double.parseDouble(strings.get(6)));
        fileReader2.close();

        FileReader fileReader3 = new FileReader("booking1.txt");
        Scanner scanner3 = new Scanner(fileReader3);
        strings.clear();
        while (scanner3.hasNextLine()){
            strings.add(scanner3.nextLine());
        }
        Booking booking1 = new Booking(customer1, carCatalog.getCar(0), strings.get(0), strings.get(1), Integer.parseInt(strings.get(2)));
        fileReader3.close();
        System.out.println(carCatalog.searchOnColor("white"));
        System.out.println(booking1.getCostOfBooking());
    }
}
