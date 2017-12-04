package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> aComparator) {
        comparators.add(aComparator);
    }

    @Override
    public int compare(City o1, City o2) {

        int cValue = comparators.get(0).compare(o1, o2);
        Iterator i = comparators.iterator();
        if (cValue == 0) {
            int k = 1;
            while(i.hasNext()) {
                int r = comparators.get(k).compare(o1, o2);
                k++;
                return r;
            }
        } return comparators.get(0).compare(o1, o2);
    }
}
