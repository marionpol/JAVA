package class1;

public class ex75 {
    private int value;

    public ex75(int valueAtStart) {
        this.value = valueAtStart;
    }
    public void printValue() {
        System.out.println("value: " + this.value);
    }
    public void decrease() {
        this.value--;
    }
    public static void main(String[] args) {
        ex75 counter = new ex75(10);
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
