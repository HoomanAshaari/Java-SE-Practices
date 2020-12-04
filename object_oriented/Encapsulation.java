public class Encapsulation {
    private String name;
    private int number;

    public String getName() {
        return name + " we (as a class designer) added this extra words using ENCAPSULATION! :)) ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        // We don't want the number be less than zero
        // So let's add some input validation before setting "number" using the power of ENCAPSULATION
        if (number > 0)
            this.number = number;
        else
        {
            System.out.println("You can't set number as a negative one!");
        }
    }
}

