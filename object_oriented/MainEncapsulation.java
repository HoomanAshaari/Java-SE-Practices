public class MainEncapsulation {
    public static void main(String[] args) {
        Encapsulation encapsulated = new Encapsulation();

        encapsulated.setName("Joe");
        System.out.println(encapsulated.getName());

        encapsulated.setNumber(10);
        System.out.println(encapsulated.getNumber());

        encapsulated.setNumber(-1);
    }
}

