package lesson30.streamApi;

public class CarForStream {
    public CarForStream(String model, int year) {
        this.model = model;
        this.year = year;
    }

    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
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
        return "CarForStream{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
