package nyamanwaterthemepark2;

public class Customer {
    private String name;
    private String contact;
    private String rateType;  
    private int numAdults;
    private int numChildren;
    private int numSeniors;
    private double discount;
    private double totalCharge;


    public Customer(String name, String contact, String rateType, int numAdults, int numChildren, int numSeniors, double discount , double totalCharge) {
        this.name = name;
        this.contact = contact;
        this.rateType = rateType;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.numSeniors = numSeniors;
        this.discount = discount;
        this.totalCharge = totalCharge;
    }


    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getRateType() {
        return rateType;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public int getNumSeniors() {
        return numSeniors;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalCharge() {
        return totalCharge;
    }

  
    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public void setNumSeniors(int numSeniors) {
        this.numSeniors = numSeniors;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTotalCharge(double totalCharge) {
        this.totalCharge = totalCharge;
    }
}
