package ex4;

import java.util.ArrayList;
import java.util.List;

public class Suitcase {
    private List<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if(totalWeight() + thing.getWeight() <= maxWeight){
            things.add(thing);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getWeight();
        }
        return total;
    }

    public void printThings(){
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }

        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;

    }

    @Override
    public String toString() {
        if (things.isEmpty()) {
            return "empty, " + totalWeight() + "kg";
        } else if (things.size() == 1) {
            return "1 thing, " + totalWeight() + "kg";
        } else {
            return things.size() + " things, " + totalWeight()
                    + "kg";
        }
    }
}
