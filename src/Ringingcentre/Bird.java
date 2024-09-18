package Ringingcentre;

public class Bird {
    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public boolean equals(Object other){
        if(this == other) return true;
        if(!(other instanceof Bird)) return false;

        Bird bird = (Bird)other;

        return this.latinName.equals(bird.latinName) && this.ringingYear == bird.ringingYear;
    }


    public int hashCode() {
        return latinName.hashCode();
    }

    @Override
    public String toString() {
        return this.latinName + "(" + this.ringingYear + ")";
    }
}
