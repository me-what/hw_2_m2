public class Samsung extends Telephone{
    String model;

    public Samsung(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Model: " + model + "\n");
    }
}
