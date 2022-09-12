package com.company;

import java.util.Comparator;

public class Cat implements Comparable<Cat>{

    static class CateratorID implements Comparator<Cat> {
        private boolean asc; // Ascending - по возрастанию

        public CateratorID() {
            this.asc = true;
        }

        public CateratorID(boolean asc) {
            this.asc = asc;
        }

        @Override
        public int compare(Cat o1, Cat o2) {
            int result = 1;
            if (this.asc) {
                result = -1;
            }

            if (o1.id < o2.id) {
                return result;
            }

            if (o1.id > o2.id) {
                return -result;
            }

            return 0;
        }
    }

    static class CateratorName implements Comparator<Cat> {
        @Override
        public int compare(Cat o1, Cat o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public Cat() {}

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id;
    public String name;

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat) obj;
        return cat.name.equals(this.name);
    }

    @Override
    public int compareTo(Cat o) {
        // this < o: -1
        if (this.id < o.id) {
            return 1;
        }

        // this > o: 1
        if (this.id > o.id) {
            return -1;
        }

        // this == o: 0
        return 0;
    }

    @Override
    public String toString() {
        return "Cat id = " + id + " name = '" + name + '\'';
    }
}
