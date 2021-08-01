package ru.netology;

public class Bomb extends Weapon {
    String result = "бабах";
    @Override
    protected String shot() {
        return result;
    }
}