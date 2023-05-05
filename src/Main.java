public class Main {
    public static void main(String[] args) {
        Samsung samsung = (Samsung) createObject("2nd");
        Iphone iphone = (Iphone) createObject("3rd");
        Xiaomi xiaomi = (Xiaomi) createObject("4th");

        samsung.print();
        iphone.print();
        xiaomi.print();
    }

    public static Object createObject(String className) {
        Object obj = null;
        switch (className) {
            case "2nd":
                obj = new Samsung("Samsung", "Samsung Galaxy S8");
                break;
            case "3rd":
                obj = new Iphone("iPhone", "purple");
                break;
            case "4th":
                obj = new Xiaomi("Xiaomi", "Android");
                break;
            default:
                System.out.println("Error: Enter a string value from 2 to 4!" + className);
        }
        return obj;
    }
}