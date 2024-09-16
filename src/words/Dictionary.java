package words;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public String translate(String word) {
        return
                dictionary.get(word);
    }

    public void add(String word, String translation) {
        dictionary.put(word,
                translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (String word : dictionary.keySet()) {
            list.add(word + " = " + dictionary.get(word));
        }
        return list;
    }

}
