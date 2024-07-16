import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

class MapUsingHash {

    private Entity[] entities;

    // Constructor
    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // Overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (Entity entity : entities) {
            if (entity != null) {
                builder.append(entity.key).append("=").append(entity.value).append(", ");
            }
        }
        if (builder.length() > 1) {
            builder.setLength(builder.length() - 2); // Remove the last comma and space
        }
        builder.append("}");
        return builder.toString();
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "A juicy fruit");

        System.out.println(map);

        // Uncomment the following code to use HashMap, TreeMap, and HashSet

        // HashMap of type String, int
        // HashMap<String, Integer> hashMap = new HashMap<>();

        // TreeMap gives you items in sorted order
        // TreeMap<String, Integer> treeMap = new TreeMap<>();
        // treeMap.put("Kunal", 89);
        // treeMap.put("Karan", 99);
        // treeMap.put("Rahul", 94);
        // System.out.println(treeMap.get("Karan"));
        // System.out.println(treeMap.getOrDefault("Bijoy", 55));
        // System.out.println(treeMap.containsKey("Kunal"));

        // HashSet<Integer> set = new HashSet<>();
        // set.add(56);
        // set.add(9);
        // set.add(12);
        // set.add(43);
        // set.add(56);
        // set.add(2);
        // System.out.println(set);
    }
}
