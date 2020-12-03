public class Boxing {
    public static void main(String[] args) {
        Integer number1 = new Integer(4);     //  Explicitly creating an object from a wrapper-class
        System.out.println("Created in a normal manner: " + number1 + "\n");

        /* But instead of above line, we could use Java's interesting feature, called Auto-boxing: */
        Integer number2 = 5;
        String someString = "Created using Auto-boxing.";
        System.out.println("Created using auto-boxing: " + number2 + "\n" + someString + "\n");

        /* Following is exactly the opposite of this technique, and is called Un-boxing: */
        int number3 = number2;
        System.out.println("Created using unboxing: " + number3);


    }
}

