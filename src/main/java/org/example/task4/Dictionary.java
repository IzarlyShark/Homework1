package org.example.task4;

public class Dictionary {
    private final KvPair[] kvPairs;
    private int size;

    public Dictionary(int capacity) {
        kvPairs = new KvPair[capacity];
        size = 0;
    }

    public void set(String key, String value) {
        for (int i = 0; i < size; i++) {
            if (kvPairs[i].getKey().equals(key)) {
                kvPairs[i] = new KvPair(key, value); // обновляем значение
                return;
            }
        }
        if (size < kvPairs.length) {
            kvPairs[size++] = new KvPair(key, value);
        } else {
            System.out.println("Словарь полон. Не удается добавить новую пару.");
        }
    }

    public String get(String key) {
        for (int i = 0; i < size; i++) {
            if (kvPairs[i].getKey().equals(key)) {
                return kvPairs[i].getValue();
            }
        }
        return null; // если ключ не найден
    }
}
