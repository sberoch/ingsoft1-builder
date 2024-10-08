package org.example;

public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }

    public Pizza(int size) {
        this(size, true, false, false);
    }

    public Pizza(int size, boolean cheese) {
        this(size, cheese, false, false);
    }

    public Pizza(int size, boolean cheese, boolean pepperoni) {
        this(size, cheese, pepperoni, false);
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                '}';
    }
}
