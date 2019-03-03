package group;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Kelvin Van Sittert
 * 216179912
 */
public class App 
{
    public static void main( String[] args )
    {
        createArrayList();
        createHashSet();
        createTreeMap();

    }

    public static void createArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kelvin");
        arrayList.add("Shane");
        arrayList.add("Kyle");
        arrayList.add("James");

        System.out.println(arrayList.toString());

    }

    public static void createHashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Kelvin");
        hashSet.add("Simon");
        hashSet.add("Kennedy");
        hashSet.add("Jones");

        System.out.println(hashSet.toString());
    }

    public static void createTreeMap(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(0, "Kelvin");
        treeMap.put(1, "Steven");
        treeMap.put(2, "Alex");
        treeMap.put(3, "Kelly");

        System.out.println(treeMap.toString());
    }
}
