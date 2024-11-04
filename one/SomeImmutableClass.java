package aston.homeWork.one;

import java.util.List;
import java.util.Map;

public final class SomeImmutableClass implements Cloneable {

    private final String name;

    private List<String> someList;

    private Map<String, Map<String, String>> someMap;

    public SomeImmutableClass(String name, List<String> someList, Map<String, Map<String, String>> someMap) {

        this.name = name;

        this.someList = Utils.listCopy(someList);

        this.someMap = Utils.mapMapCopy(someMap);
    }

    public String getName() {
        return name;
    }

    public List<String> getSomeList() {
        return someList;
    }

    public Map<String, Map<String, String>> getSomeMap() {
        return someMap;
    }

    @Override
    public SomeImmutableClass clone() {
        try {
            SomeImmutableClass clone = (SomeImmutableClass) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.someMap = Utils.mapMapCopy(this.someMap);
            clone.someList = Utils.listCopy(this.someList);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "SomeImmutableClass{" +
                "name='" + name + '\'' +
                ", someList=" + someList +
                ", someMap=" + someMap +
                '}';
    }
}
