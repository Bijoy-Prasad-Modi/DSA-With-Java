import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapUsingLL<K, V> {

    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public HashMapUsingLL() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        if ((float) size / list.size() > lf) {
            reHash();
        }

        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("We are now rehashing!");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        size = 0;
        for (LinkedList<Entity> entries : old) {
            for (Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                target = entity;
                break;
            }
        }
        if (target != null) {
            entities.remove(target);
            size--;
        }
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");

        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                builder.append(entity.key);
                builder.append(" = ");
                builder.append(entity.value);
                builder.append(" , ");
            }
        }
        if (builder.length() > 1) {
            builder.setLength(builder.length() - 2); // Remove the last comma and space
        }
        builder.append("}");
        return builder.toString();
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }
}
