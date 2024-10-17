package lesson07;

import java.util.Random;

public class Car {

    private String color;
    private double engineVolume;
    private int wheelCount;
    private String type;
    private boolean hasAirConditioner;
    private String brand;
    private int date;
    private boolean active = true;
    private boolean sold = false;

    public Car() {
    }

    public Car(String color, double engineVolume, int wheelCount,
               String type, boolean hasAirConditioner,
               String brand, int date) {
        this.color = color;
        this.engineVolume = engineVolume;
        this.wheelCount = wheelCount;
        this.type = type;
        this.hasAirConditioner = hasAirConditioner;
        this.brand = brand;
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isSold() {
        return sold;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                ", wheelCount=" + wheelCount +
                ", type='" + type + '\'' +
                ", hasAirConditioner=" + hasAirConditioner +
                ", brand='" + brand + '\'' +
                ", date=" + date +
                '}';
    }


    public void buy() {
        active = false;
        sold = true;
    }

    public void tryIt() {
        if (new Random().nextBoolean()) {
          buy();
        } else {
            active = false;
        }
    }
}
