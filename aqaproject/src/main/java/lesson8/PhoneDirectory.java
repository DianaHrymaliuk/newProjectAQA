package lesson8;

import java.util.*;

public class PhoneDirectory {
    public Map<String, List<String>> phoneDirectory;

    public PhoneDirectory() {
        this.phoneDirectory = new HashMap<>();
    }

    public List<String> numbers;

    public void add(String name, String number) {
        if (phoneDirectory.containsKey(name)) {
            phoneDirectory.put(name, Collections.singletonList(number));
        } else numbers = new ArrayList<>();
        numbers.add(number);
        phoneDirectory.put(name, numbers);
    }

    public List<String> get(String name) {
        System.out.print(name);
        return phoneDirectory.get(name);
    }
}
