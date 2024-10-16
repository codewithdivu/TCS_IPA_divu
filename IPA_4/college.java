package IPA_4;

public class college {
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pincode;

    public college(int id, String name, int mobileNo, String address, int picode) {
        this.id = id;
        this.name = name;
        this.contactNo = mobileNo;
        this.address = address;
        this.pincode = picode;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getContactNo() {
        return this.contactNo;
    }

    public String getAddress() {
        return this.address;
    }

    public int getPincode() {
        return this.pincode;
    }
}
