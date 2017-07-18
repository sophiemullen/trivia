package com.adaptionsoft.games.uglytrivia.player;

public class Player {

    private int index;
    private String name;
    private int amountOfCoins;
    private boolean isInPenaltyBox;

    private Player() {
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public int getAmountOfCoins() {
        return amountOfCoins;
    }

    public void setAmountOfCoins(int amountOfCoins) {
        this.amountOfCoins = amountOfCoins;
    }

    public static class Builder {

        private int index;
        private String name;
        private int amountOfCoins;

        public Player build() {
            return new Player();
        }

        public Builder withIndex(int index) {
            this.index = index;
            return this;
        }
        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAmountOfCoins(int amountOfCoins) {
            this.amountOfCoins = amountOfCoins;
            return this;
        }
    }
}
