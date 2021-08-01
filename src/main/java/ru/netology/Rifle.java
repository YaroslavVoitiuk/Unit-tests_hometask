package ru.netology;

public class Rifle extends Weapon{
    String result = "вжжух";
    @Override
    protected String shot() {
        return result;
    }
}
