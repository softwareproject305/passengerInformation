
class Passenger {
    private String name;     // Private attributes to store passenger information
    private String seatNumber;
    private int cpr;
    private String birthDate;
    private String address;
    private int passportNum;

    // Constructor to initialize the Passenger object with provided information
    public Passenger(String name, String seatNumber, int cpr, String birthDate, String address, int passportNum) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.cpr = cpr;
        this.birthDate = birthDate;
        this.address = address;
        this.passportNum = passportNum;
    }
    // Getter method to retrieve the passenger's name
    public String getName() {
        return name;
    }
    // Getter method to retrieve the passenger's seat number
    public String getSeatNumber() {
        return seatNumber;
    }
    // Getter method to retrieve the passenger's cpr
    public int getCpr() {
        return cpr;
    }
    // Getter method to retrieve the passenger's birth date
    public String getBirthDate() {
        return birthDate;
    }
    // Getter method to retrieve the passenger's address
    public String getAddress() {
        return address;
    }
    // Getter method to retrieve the passenger's passport
    public int getPassportNum() {
        return passportNum;
    }


        
}