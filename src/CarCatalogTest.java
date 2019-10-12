import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CarCatalogTest {

    private CarCatalog carCatalog = new CarCatalog();

    @Before
    public void init() throws IOException {
        FileReader fileReader1 = new FileReader("car1.txt");
        Scanner scanner1 = new Scanner(fileReader1);
        ArrayList<String> strings = new ArrayList<String>();
        while (scanner1.hasNextLine()){
            strings.add(scanner1.nextLine());
        }
        carCatalog.addCar(strings.get(0), strings.get(1), strings.get(2),
                strings.get(3), strings.get(4), Double.parseDouble(strings.get(5)));
        fileReader1.close();
    }

    @Test
    public void searchOnColor(){
        int [] expected = new int[1];
        expected[0] = 0;
        ArrayList<Integer> arrayList;
        arrayList = carCatalog.searchOnColor("white");
        int[] array = arrayList.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, array);
    }

    @Test
    public void searchOnMake(){
        int [] expected = new int[1];
        expected[0] = 0;
        ArrayList<Integer> arrayList;
        arrayList = carCatalog.searchOnMake("Toyota");
        int[] array = arrayList.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, array);
    }
}