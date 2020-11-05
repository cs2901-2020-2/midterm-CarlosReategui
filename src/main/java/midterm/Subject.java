package midterm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    HashMap<Character, Integer> data = new HashMap<>();

    public Subject() {
        data.put('A', 40);
        data.put('B', 25);
        data.put('C', 15);
        data.put('D', 20);
    }

    public void setData(Character character, Integer value) {
        data.put(character, value);
        this.notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public HashMap<Character, Integer> getData() {
        return data;
    }

    public String getDataAsString() {
        StringBuilder formattedData = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : data.entrySet()) {
            Character character = entry.getKey();
            Integer value = entry.getValue();
            formattedData.append(character).append(": ").append(value).append(". ");
        }
        return formattedData.toString();
    }
}
