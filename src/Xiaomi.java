public class Xiaomi extends Telephone{
    private String operationSystem;

    public Xiaomi(String name, String operationSystem) {
        super(name);
        this.operationSystem = operationSystem;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", OS: " + operationSystem + "\n");
    }
}
