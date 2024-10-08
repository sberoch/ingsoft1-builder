package org.example;

public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                '}';
    }

    public static class Builder {
        private int size;
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese() {
            cheese = true;
            return this;
        }

        public Builder pepperoni() {
            pepperoni = true;
            return this;
        }

        public Builder bacon() {
            bacon = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
