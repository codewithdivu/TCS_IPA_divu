package IPA_5;

public class motel {
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public motel(int id, String name, String date, int noOfRoomsBooked, String cabFacility, double bill) {
        this.motelId = id;
        this.motelName = name;
        this.dateOfBooking = date;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = bill;
    }

    public int getMotelId() {
        return this.motelId;
    }

    public String getMotelName() {
        return this.motelName;
    }

    public String getDateOfBooking() {
        return this.dateOfBooking;
    }

    public int getNoOfBookedRooms() {
        return this.noOfRoomsBooked;
    }

    public String getCabFacility() {
        return this.cabFacility;
    }

    public double getTotalBill() {
        return this.totalBill;
    }

}
