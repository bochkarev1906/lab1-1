public class Booking {
    private String date;
    private String pickupLocation;
    private int amountDays;
    private Car car;
    private Customer customer;

    Booking (Customer customer, Car car, String date, String pickupLocation, int amountDays){
        if (customer.getDrivingExperience() >= car.getMinDrivingExperience()){
            this.customer = customer;
            this.car = car;
            this.date = date;
            this.amountDays = amountDays;
            this.pickupLocation = pickupLocation;
        }
        else{
            System.out.println("Not enough driving experience!");
        }
    }
}
