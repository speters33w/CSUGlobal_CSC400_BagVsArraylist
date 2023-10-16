package edu.csuglobal.csc400;

/**
 * This class represents a customer in the system.
 */
public class Customer {
    private String customerID;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String creditCardNumber;
    private String creditCardExpiration;
    private String creditCardCVV;
    private String creditCardType;
    private String creditCardName;
    private String creditCardZipCode;

    /**
     * Creates a new customer object without credit card information.
     *
     * @param customerID String representation of the customer's unique ID.
     * @param firstName String representation of the customer's first name.
     * @param lastName String representation of the customer's last name.
     * @param address String representation of the customer's street address.
     * @param city String representation of the customer's city.
     * @param state String representation of the customer's state.
     * @param zip String representation of the customer's zip code.
     * @param phone String representation of the customer's phone number.
     * @param email String representation of the customer's email address.
     */
    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email) {
        new Customer(customerID, firstName, lastName, address, city, state, zip, phone, email,
                "Undefined", "Undefined", null,
                "Undefined", "Undefined", "Undefined");
    }

    /**
     * Creates a new customer object with credit card information
     * except for CVV which it stores as "Undefined".
     *
     * @param customerID String representation of the customer's unique ID.
     * @param firstName String representation of the customer's first name.
     * @param lastName String representation of the customer's last name.
     * @param address String representation of the customer's street address.
     * @param city String representation of the customer's city.
     * @param state String representation of the customer's state.
     * @param zip String representation of the customer's zip code.
     * @param phone String representation of the customer's phone number.
     * @param email String representation of the customer's email address.
     * @param creditCardNumber String representation of the customer's credit card number.
     * @param creditCardExpiration String representation of the customer's credit card expiration date.
     * @param creditCardType String representation of the customer's credit card type.
     *                       (e.g. Visa, MasterCard, American Express, etc.)
     * @param creditCardName String representation of the customer's credit card holder name.
     * @param creditCardZipCode String representation of the customer's credit card zip code.
     */
    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email, String creditCardNumber, String creditCardExpiration,
                    String creditCardType, String creditCardName, String creditCardZipCode) {
        new Customer(customerID, firstName, lastName, address, city, state, zip, phone, email, creditCardNumber,
                creditCardExpiration, null, creditCardType, creditCardName, creditCardZipCode);
    }

    /**
     * Creates a new customer object with credit card information including CVV.
     *
     * @param customerID String representation of the customer's unique ID.
     * @param firstName String representation of the customer's first name.
     * @param lastName String representation of the customer's last name.
     * @param address String representation of the customer's street address.
     * @param city String representation of the customer's city.
     * @param state String representation of the customer's state.
     * @param zip String representation of the customer's zip code.
     * @param phone String representation of the customer's phone number.
     * @param email String representation of the customer's email address.
     * @param creditCardNumber String representation of the customer's credit card number.
     * @param creditCardExpiration String representation of the customer's credit card expiration date.
     * @param creditCardCVV String representation of the customer's credit card CVV number.
     * @param creditCardType String representation of the customer's credit card type.
     *                       (e.g. Visa, MasterCard, American Express, etc.)
     * @param creditCardName String representation of the customer's credit card holder name.
     * @param creditCardZipCode String representation of the customer's credit card zip code.
     */
    public Customer(String customerID, String firstName, String lastName, String address, String city, String state,
                    String zip, String phone, String email, String creditCardNumber, String creditCardExpiration,
                    String creditCardCVV, String creditCardType, String creditCardName, String creditCardZipCode) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiration = creditCardExpiration;
        this.creditCardCVV = creditCardCVV;
        this.creditCardType = creditCardType;
        this.creditCardName = creditCardName;
        this.creditCardZipCode = creditCardZipCode;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public void setState (String state) {
        this.state = state;
    }

    public void setZip (String zip) {
        this.zip = zip;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setCreditCardNumber (String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCreditCardExpiration (String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }

    public void setCreditCardCVV (String creditCardCVV) {
        this.creditCardCVV = creditCardCVV;
    }

    public void setCreditCardType (String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public void setCreditCardName (String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public void setCreditCardZipCode (String creditCardZipCode) {
        this.creditCardZipCode = creditCardZipCode;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String[] getAddress() {
       return new String[]{address, city, state, zip};
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return String.format("Customer ID: %s%n%s %s%n%s%n%s, %s %s%nPhone: %s%nEmail: %s%n",
                customerID, firstName, lastName, address, city, state, zip, phone, email);
    }

}
