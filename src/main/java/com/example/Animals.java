package com.example;

public class Animals {

    public class Chien implements Animal {
        private final String name;

        public Chien(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getType() {
            return "Chien";
        }
    }

    public class Chat implements Animal {
        private final String name;

        public Chat(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getType() {
            return "Chat";
        }
    }

    public class Lion implements Animal {
        private final String name;

        public Lion(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getType() {
            return "Lion";
        }
    }

}
