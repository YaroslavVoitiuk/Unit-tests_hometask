package ru.netology;

public class Player{

    private Weapon[] weaponsBox;
    private static final int MIN_VALUE = 0;

    protected Player(){
        weaponsBox = new Weapon[]{
                new Pistol(),
                new Bomb(),
                new Rifle(),
                new Slingshot()
        };
    }


    protected int getWeaponsQuantity(){
        return weaponsBox.length;
    }

//    protected void useWeapon(int chooseWeapon){
//        if(chooseWeapon >= getWeaponsQuantity() || chooseWeapon < MIN_VALUE ){
//            System.out.println("Упс! Оружия под этим номером не существует! ");
//        } else{
//            Weapon weapon = weaponsBox[chooseWeapon];
//            weapon.shot();
//        }
//    }
    protected void useWeapon(int chooseWeapon){

            Weapon weapon = weaponsBox[chooseWeapon];
            weapon.shot();

    }
}