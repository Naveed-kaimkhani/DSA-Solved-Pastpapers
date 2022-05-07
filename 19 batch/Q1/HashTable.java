import java.util.Hashtable;

import javax.swing.text.AbstractDocument.BranchElement;

// Hashing with linear probing

public class HashTable {
    private static final HashTable.Entry NIL = null;
    private Entry[] entries;
    static int size, used;
    private double LoadFactor;

    HashTable(int capacity, double LoadFactor) {
        entries = new Entry[capacity];
        this.LoadFactor = LoadFactor;
    }

    // Hashtable(int capacity){
    // entries=new entries[capacity];
    // this.LoadFactor=0.75;
    // }

    class Entry {
        Object Key, value;

        Entry(Object key, Object value) {
            this.Key = key;
            this.value = value;

        }
    }

    private int hash(Object key) {
        return (key.hashCode() & 0xFFFFFFF) % entries.length;
    }

    public int size() {
        return size;
    }

    public void put(Object key, Object value) {
        if (used > LoadFactor * entries.length)
            rehash();
        int h = hash(key);
        for (int i = 0; i < entries.length; i++) {
            int j = (h + i) % entries.length;
            // int j = nextProbe(h,i);
            Entry entry = entries[j];
            if (entry == null || entries[j] == NIL) {
                entries[j] = new Entry(key, value);
                ++size;
                ++used;
                break;
            }
        }
    }

    public Object get(Object key) {
        int h = hash(key);
        for (int i = 0; i < entries.length; i++) {
            int j = (h + i) % entries.length;
            Entry entry = entries[j];
            if (entry == null)
                break;
            if (entry == NIL)
                continue;
            if (entry.Key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public Object remove(Object key) {
        int h = hash(key);
        for (int i = 0; i < entries.length; i++) {
            int j = (h + i) % entries.length;
            if (entries[i] == null)
                break;
            if (entries[j].Key.equals(key)) {
                Object value = entries[j].value;
                entries[j] = NIL;
                --size;
                return value;
            }
        }
        return null;
    }

    public void rehash() {
        Entry[] oldentries = entries;
        entries = new Entry[2 * oldentries.length];
        for (int k = 0; k < oldentries.length; k++) {
            Entry entry = oldentries[k];

            if (entry == null)
                continue;
            int h = hash(entry.Key);

            for (int i = 0; i < entries.length; i++) {
                int j = (h+i)% entries.length;
                if (entries[j] == null) {
                    entries[j] = entry;
                    break;
                }
            }
            used = size;
        }
    }

    public static void main(String[] args) {
        System.out.println(7 % 10);
        System.out.println(17 % 10);
        System.out.println("Both the above key have the same modulus which leads to collision \nAnd we are solving that issue with linear probing");
        HashTable ht=new HashTable(10,0.75);
        ht.put(7,5);
        ht.put(17,6);
        System.out.println(ht.get(7));
        System.out.println(ht.get(17));
    }
}

