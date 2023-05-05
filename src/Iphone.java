public class Iphone extends Telephone{
    private String color;

    public Iphone(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Color: " + color + "\n");
    }
}