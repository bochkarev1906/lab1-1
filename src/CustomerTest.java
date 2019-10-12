import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void init() throws IOException {
        FileReader fileReader2 = new FileReader("customer1.txt");
        Scanner scanner2 = new Scanner(fileReader2);
        ArrayList<String> strings = new ArrayList<String>();
        while (scanner2.hasNextLine()){
            strings.add(scanner2.nextLine());
        }
        Customer customer1 = new Customer(strings.get(0), strings.get(1), strings.get(2),
                strings.get(3), strings.get(4), strings.get(5), Double.parseDouble(strings.get(6)));
        fileReader2.close();
    }
}