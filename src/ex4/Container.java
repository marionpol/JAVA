package ex4;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Suitcase> suitcases;
    private int weightLimit;

    public Container(int weightLimit) {
        this.suitcases = new ArrayList<Suitcase>();

        this.weightLimit = weightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= weightLimit) {
            suitcases.add(suitcase);
        }
    }
    public int totalWeight(){
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
