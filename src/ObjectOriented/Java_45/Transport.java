package ObjectOriented.Java_45;

public abstract class Transport {
    protected String name;
    protected Manufacture manufacture;

    public Transport(String name, Manufacture manufacture) {
        this.name = name;
        this.manufacture = manufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public void start() {
        System.out.println("Starting " + name);
    }

    public void stop() {
        System.out.println("Stopping " + name);
    }
    public abstract double speed();
}
