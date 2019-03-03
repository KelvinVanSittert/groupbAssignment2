package group;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void createArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kelvin");
        arrayList.add("Shane");
        arrayList.add("Kyle");
        arrayList.add("James");

        Assert.assertEquals("[Kelvin, Shane, Kyle, James]", arrayList.toString());

    }

    @Test
    public void createHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Kelvin");
        hashSet.add("Simon");
        hashSet.add("Kennedy");
        hashSet.add("Jones");

        Assert.assertEquals("Contains 'Kelvin'", hashSet.contains("Kelvin"),true);
    }

    @Test
    public void createTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(0, "Kelvin");
        treeMap.put(1, "Steven");
        treeMap.put(2, "Alex");
        treeMap.put(3, "Kelly");

        Assert.assertEquals("Contains Kelvin", treeMap.get(0),"Kelvin");

    }
}
