package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();
    NameComparator city = new NameComparator();
    StateComparator state = new StateComparator();


    public void add(Comparator<City> aComparator) {
        comparators.add(aComparator);
    }

    @Override
    public int compare(City o1, City o2) {
        // TODO: Complete step 5 in Bonus mission
//        comparators.add(city);
//        comparators.add(state);
//        Comparator<City> c = comparators.get(0);

//        Iterator<Comparator<City>> i = comparators.iterator();
        int cValue = o1.getState().compareTo(o2.getState());

        if (cValue == 0) {
            return city.compare(o1, o2);
        }

//       System.out.println(value);
        return state.compare(o1, o2);
    }
}
