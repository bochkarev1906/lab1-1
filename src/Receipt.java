public class Receipt {
    private Booking booking;

    Receipt(Booking booking){
        this.booking = booking;
        System.out.println(booking.getDate() + " "
                + booking.getCustomer().getFullName()
                + " rent "
                + booking.getCar().getMake() + " "
                + booking.getCar().getModel()
                + " on "
                + booking.getamountDays()
                + " days \n"
                + "Cost: "
                + booking.getCostOfBooking()
        );
    }


}
