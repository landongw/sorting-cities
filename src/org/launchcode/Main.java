package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator city = new NameComparator();
        StateComparator state = new StateComparator();
        PopulationComparator population = new PopulationComparator();
        AreaComparator area = new AreaComparator();
        CompoundComparator compound = new CompoundComparator();

        compound.add(new StateComparator());
        compound.add(new NameComparator());
        compound.add(new PopulationComparator());
        compound.add(new AreaComparator());

        cities.sort(city);
        cities.sort(state);
        cities.sort(population);
        cities.sort(area);
        cities.sort(compound);

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
