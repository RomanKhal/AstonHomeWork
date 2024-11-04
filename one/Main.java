package aston.homeWork.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("initiate test data:");
        List<String> testList = new ArrayList<>();
        testList.add("one");
        Map<String, String> innerMap1 = new HashMap<>();
        innerMap1.put("inOne", "goodOne1");
        Map<String, String> innerMap2 = new HashMap<>();
        innerMap2.put("inTwo", "goodOne2");
        Map<String, Map<String, String>> outerMap = new HashMap<>();
        outerMap.put("outOne", innerMap1);
        outerMap.put("outTwo", innerMap2);
        System.out.println("list: " + testList + "\nmapMap: " + outerMap);
        System.out.println("\ncreate class:");
        SomeImmutableClass someImmutableClass = new SomeImmutableClass("name", testList, outerMap);
        SomeImmutableClass clone = someImmutableClass.clone();
        System.out.println(someImmutableClass);
        System.out.println("\nmutate test data:");
        testList.add("three");
        innerMap1.clear();
        innerMap2.put("inOneBad", "badOne");
        outerMap.put("outThree", innerMap2);
        System.out.println("list: " + testList + "\nmapMap: " + outerMap);
        System.out.println("\nsure that our class not mutated:");
        System.out.println(someImmutableClass);

        System.out.println("this is clone");
        System.out.println(clone);

        System.out.println("check clone == someImmutableClass: " + (clone == someImmutableClass));
        System.out.println("check clone.getSomeList() == someImmutableClass.getSomeList(): " + (clone.getSomeList() == someImmutableClass.getSomeList()));
    }
}
