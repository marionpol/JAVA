package class1;

public class ex84 {
    public int value;
    public boolean check;


    public ex84(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public ex84(boolean check) {
        this(0, check);
    }

    public ex84() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0)
        {
            if (check) {
                value = Math.max(0, value - decreaseAmount);
            } else {
                value -= decreaseAmount;

            }
        }
    }

    public static void main(String[] args) {
        ex84 overloaded = new ex84(10, true);


        System.out.println(overloaded.value());
        overloaded.increase(5);
        System.out.println(overloaded.value());
        overloaded.decrease(3);
        System.out.println(overloaded.value());
    }
}
