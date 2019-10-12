import java.util.ArrayList;

public class CarCatalog {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar(String make, String model, String number,
                       String segment, String color, double minDrivingExperience){
        Car car = new Car(make, model, number, segment, color, minDrivingExperience);
        cars.add(car);
    }

    public void removeCar(int id){
        cars.remove(id);
    }

    public Car getCar(int id){
        return cars.get(id);
    }

    public ArrayList searchOnColor(String make){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getColor().contains(make)){
                arrayList.add(i);
            }

        }
        return arrayList;
    }

    public ArrayList searchOnMake(String make){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cars.size(); i++){
            if (cars.get(i).getMake().contains(make)){
                arrayList.add(i);
            }

        }
        return arrayList;
    }
}
