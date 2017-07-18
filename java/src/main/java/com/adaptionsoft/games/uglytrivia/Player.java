package com.adaptionsoft.games.uglytrivia;

public class Player {

    private int index;
    private String name;

    private Player() {
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public static class Builder {

        private int index;
        private String name;

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
    }
}
