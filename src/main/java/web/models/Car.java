package web.models;

public class Car {
    private String name;
    private int model;
    private int year;

    public Car(String name, int model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car {" +
                "name = '" + name + '\'' +"\n"+
                ", model = " + model +"\n"+
                ", year = " + year +"\n"+
                '}';
    }
}
