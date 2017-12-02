package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {

        int primitive1 = o1.getPopulation();
        int primitive2 = o2.getPopulation();
        Integer a = new Integer(primitive1);
        Integer b = new Integer(primitive2);

        return a.compareTo(b);
    }
}
