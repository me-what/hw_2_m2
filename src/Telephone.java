public abstract class Telephone implements Printable {
    private String name;

    public Telephone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
