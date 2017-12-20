package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String kindOfRoll) {
            if (Roll.AVAILABLE_ROLLS.contains(kindOfRoll)) {
                this.roll = kindOfRoll;
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String kindOfSauce) {
            if (Sauce.AVAILABLE_SAUCE.contains(kindOfSauce)) {
                this.sauce = kindOfSauce;
            } else {
                throw new NullPointerException("You need to choose dressing");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (Ingredients.LIST_OF_INGREDIENTS.contains(ingredient)) {
                ingredients.add(ingredient);
            } else {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Sorry, " + ingredient + " is not available");
                }
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    public Bigmac(final String roll, final int burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
