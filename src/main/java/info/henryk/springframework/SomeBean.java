package info.henryk.springframework;

import java.util.List;
import java.util.Set;

public class SomeBean {
    List<String> stringList;
    Set<Integer> integersList;
    Long[] longArray;

    public SomeBean(List<String> stringList, Set<Integer> integersList, Long[] longArray) {
        this.stringList = stringList;
        this.integersList = integersList;
        this.longArray = longArray;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<Integer> getIntegersList() {
        return integersList;
    }

    public void setIntegersList(Set<Integer> integersList) {
        this.integersList = integersList;
    }

    public Long[] getLongArray() {
        return longArray;
    }

    public void setLongArray(Long[] longArray) {
        this.longArray = longArray;
    }
}
