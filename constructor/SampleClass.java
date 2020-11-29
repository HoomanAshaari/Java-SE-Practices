public class SampleClass {
    int number=3;       // step 4
    static int number2 = 3;        // step 1

    int number3;        // step 5
    static int number4; // step 2

    {   // step 6
        System.out.println("Non-static block executing...");
    }

    static {    // step 3
        System.out.println("Static block executing...");
    }

    public SampleClass(int number, int number3) {   // step 7
        this.number = number;
        this.number3 = number3;
    }
}
