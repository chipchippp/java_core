package ObjectOriented.Java_45;

public class Airplane extends Transport {
    private String fuel;

    public Airplane(String name, Manufacture manufacture, String fuel) {
        super(name, manufacture);
        this.fuel = fuel;
    }

    @Override
    public double speed() {
        if (this.fuel.equals("Jet Fuel")) {
            return 900; // Giả sử tốc độ là 900 km/h cho Jet Fuel
        } else if (this.fuel.equals("Aviation Gasoline")) {
            return 600; // Giả sử tốc độ là 600 km/h cho Aviation Gasoline
        } else {
            return 0; // Nếu không xác định được nhiên liệu
        }
    }

    public String getFuel() {
        return fuel;
    }
}

