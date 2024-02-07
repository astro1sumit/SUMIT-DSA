import com.sun.source.tree.BreakTree;

import javax.swing.text.html.parser.Entity;
import java.util.*;

class MapUsingHash {
    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void removes(String key){
        int hash = Math.abs(key.hashCode()% entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash]=null;
        }
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key=key;
            this.value=value;
        }
    }
}


public class HASMAP {
    public static void main(String[] args){
        MapUsingHash map = new MapUsingHash();
        map.put("hdgf","hgcjsgd");
        map.put( "a am a good boy","dhvcgd dvchdgv");

        System.out.println(map.get("a am a good boy"));


//        HashMap<String, Integer> map= new HashMap<>();
//        map.put("sumit",55);
//        map.put("kunal",5);
//        map.put("rahul",54);
//        System.out.println(map.get("sumit"));
//        System.out.println(map.get("kunal"));
//        System.out.println(map.get("rahul"));
//        System.out.println(map.getOrDefault("kumkum", 6767));
//        System.out.println(map.containsKey("sumit"));
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(55);
//        set.add(56);
//        set.add(55);
//        set.add(3);
//        set.add(77);
//        set.add(57);
//
//        System.out.println(set);
    }
}
