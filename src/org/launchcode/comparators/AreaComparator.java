package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        int primitive1 = (int) o1.getArea();
        int primitive2 = (int) o2.getArea();
        Integer a = new Integer(primitive1);
        Integer b = new Integer(primitive2);

        return a.compareTo(b);
    }
}
