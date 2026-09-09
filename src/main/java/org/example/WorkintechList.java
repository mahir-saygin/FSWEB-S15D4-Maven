package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object element) {
        if (contains(element)) {
            return false;
        }

        return super.add(element);
    }

    public void sort() {
        super.sort((a, b) -> {
            if (a instanceof Number && b instanceof Number) {
                return Double.compare(((Number) a).doubleValue(), ((Number) b).doubleValue());
            }

            return a.toString().compareTo(b.toString());
        });
    }

    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);

        if (removed) {
            sort();
        }

        return removed;
    }
}