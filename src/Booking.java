public class Booking {
    private String date;
    private String pickupLocation;
    private int amountDays;
    private Car car;
    private Customer customer;
    public static int amountBookings = 0;

    Booking (Customer customer, Car car, String date, String pickupLocation, int amountDays){
        if (customer.getDrivingExperience() >= car.getMinDrivingExperience()){
            this.customer = customer;
            this.car = car;
            this.date = date;
            this.amountDays = amountDays;
            this.pickupLocation = pickupLocation;
            amountBookings++;
        }
        else{
            System.out.println("Not enough driving experience!");
        }
    }

    public int getCostOfBooking(){
        return amountDays * car.getCost();
    }

    public int getAmountBookings(){
        return amountBookings;
    }
}
