package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        StateComparator comparator2 = new StateComparator();
        PopulationComparator comparator3 = new PopulationComparator();
        AreaComparator comparator4 = new AreaComparator();

        cities.sort(comparator);
        cities.sort(comparator2);
        cities.sort(comparator3);
        cities.sort(comparator4);

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
