package ru.netology;
import java.util.Scanner;


class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static void printBorder(){
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Player player = new Player();
        while(true){
            printBorder();
            System.out.format("У игрока %d видов оружия,"
                            + " введите номер, чтобы выстрелить,"
                            + " end чтобы выйти%n",
                    player.getWeaponsQuantity());
            printBorder();
            String input = scanner.nextLine();
            if(input.equals("end")){
                printBorder();
                System.out.println("Game over!");
                break;
            }
            int weaponNumber = Integer.parseInt(input)-1;
            printBorder();
            player.useWeapon(weaponNumber);
        }
    }
}