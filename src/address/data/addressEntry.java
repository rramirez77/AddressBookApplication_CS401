package address.data;

/**
 * addressEntry class represents a single entry
 */
public class addressEntry {
    /**
     * First name of addressEntry contact
     **/
    private String firstName;

    /**
     * Last name of addressEntry contact
     **/
    private String lastName;

    /**
     * Street of addressEntry contact
     **/
    private String street;

    /**
     * City of addressEntry contact
     **/
    private String city;

    /**
     * State of addressEntry contact
     **/
    private String state;

    /**
     * ZIP of addressEntry contact
     **/
    private int zip;

    /**
     * Phone of addressEntry contact
     **/
    private String phone;

    /**
     * Email of addressEntry contact
     **/
    private String email;

    /**
     * Default Constructor initializes all attributes to a default value
     **/
    public addressEntry(){
        firstName = " ";
        lastName = " ";
        street = "";
        city = "";
        state = "";
        zip = 0;
        phone = "";
        email = "";
    }

    /**
     * Other constructor
     * Initializes all attributes to a new value
     * @param firstName new first name
     * @param lastName new last name
     * @param street new street name
     * @param state new state
     * @param zip new zipcode
     * @param phone new phone number
     * @param email new email
     */
    public addressEntry(String firstName, String lastName, String street, String city,
                        String state, int zip, String phone, String email){
        // Initialize the class variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Creates a formatted string of all the attributes
     * @return a String with all attributes
     */
    public String toString(){
        return firstName + " " + lastName + "\n" + street +
                "\n" + city + ", " + state + " " + zip + "\n" + email + "\n"+ phone + "\n\n";
    }

    /** * * * * * * * * *
     * Set and get methods
     ** * * * * * * * * */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Integer getZip() {
        return zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
