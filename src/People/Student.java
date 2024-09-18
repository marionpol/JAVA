package People;

public class Student extends Person {
    public int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study(){
        credits++;
    }
    public int credits(){
        return credits;
    }

    @Override
    public String toString() {
        return super.toString() + ", credits: " + credits;
    }

}
