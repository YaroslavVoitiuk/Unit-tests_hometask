package ru.netology;

public class Slingshot extends Weapon{
    String result = "пиу пиу";
    @Override
    protected String shot() {
        return result;
    }
}
