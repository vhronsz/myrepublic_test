package Model;

public class Car {
    private String brand;
    private String color;

    private double price;
    private String  priceUnit;

    private int speed;
    private String speedUnit;

    public Car(String brand, String color, double price, String priceUnit, int speed, String speedUnit) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.priceUnit = priceUnit;
        this.speed = speed;
        this.speedUnit = speedUnit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSpeedUnit() {
        return speedUnit;
    }

    public void setSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
    }
}
