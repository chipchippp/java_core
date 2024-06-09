package ObjectOriented.Java_45;

public class Main {
    public static void main(String[] args) {
        Manufacture boeing = new Manufacture("Boeing", "USA");
        Airplane airplane = new Airplane("Airplane", boeing, "Jet Fuel");
        
        System.out.println("Transport Type: " + airplane.getName());
        System.out.println("Manufacture: " + airplane.getManufacture().getName());
        System.out.println("Fuel Type: " + airplane.getFuel());
        System.out.println("Speed: " + airplane.speed());
    }
}
