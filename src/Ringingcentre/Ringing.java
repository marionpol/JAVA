package Ringingcentre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ringing {
    private Map<Bird, List<String>> observations = new HashMap<>();


    public void observe(Bird bird, String place){
        observations.computeIfAbsent(bird, k -> new ArrayList<>()).add(place);
    }

    public void observations(Bird bird){
        List<String> places = observations.get(bird);
        if (places != null && !places.isEmpty()) {
            System.out.println(bird + " has been observed in:");
            for (String place : places) {
                System.out.println(" - " + place);
            }
        } else {
            System.out.println(bird + " has not been observed.");
        }
    }
}
