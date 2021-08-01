package ru.netology;

public class Pistol extends Weapon {
    String result = "пау пау";
    @Override
    protected String shot() {
        return result;
    }
}
