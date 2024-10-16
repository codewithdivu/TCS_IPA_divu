package IPA_7;

public class sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String cirlce;

    sim(int id, String name, double balance, double rate, String cirlce) {
        this.simId = id;
        this.customerName = name;
        this.balance = balance;
        this.ratePerSecond = rate;
        this.cirlce = cirlce;
    }

    public int getSimId() {
        return this.simId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getRatePerSecond() {
        return this.ratePerSecond;
    }

    public String getCircle() {
        return this.cirlce;
    }

    public void setCircle(String cirlce) {
        this.cirlce = cirlce;
    }
}
