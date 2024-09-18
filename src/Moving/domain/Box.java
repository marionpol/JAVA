package Moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    public int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public int getVolume() {
        int volume = 0;
        for (Thing thing : things) {
            volume += thing.getVolume();
        }
        return volume;
    }

    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= maximumCapacity) {
            things.add(thing);
            return true;
        }
        return false;
    }
}
