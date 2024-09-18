package Moving.domain;

import java.util.Comparator;

public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int compareTo(Item otherItem) {
        return name.compareTo(otherItem.name);
    }

    public String getName(){
        return name;
    }

    public String  toString(){
        return name + " (" + volume + " dm^3)";
    }

}
