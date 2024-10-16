package IPA_2;

public class footwear {
    private int id;
    private String name;
    private String type;
    private int price;

    public footwear(int id, String name, String type, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getFootWearId() {
        return this.id;
    }

    public void setFootWearId(int id) {
        this.id = id;
    }

    public String getFootWearName() {
        return this.name;
    }

    public void setFootWearName(String name) {
        this.name = name;
    }

    public String getFootWearType() {
        return this.type;
    }

    public void setFootWearType(String type) {
        this.type = type;
    }

    public int getFootWearPrice() {
        return this.price;
    }

    public void setFootWearPrice(int price) {
        this.price = price;
    }

}
