public class Customer {
    private String firstName;
    private String lastName;
    private String mobilePhone;
    private String address;
    private String email;
    private String document;
    private double drivingExperience;

    Customer (String firstName, String lastName, String mobilePhone, String address,
              String email, String document, double drivingExperience){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePhone = mobilePhone;
        this.address = address;
        this.email = email;
        this.document = document;
        this.drivingExperience = drivingExperience;
    }

    public double getDrivingExperience() {
        return drivingExperience;
    }
    public String getFullName() {
        return lastName + firstName;
    }

    public void setDrivingExperience(double drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
