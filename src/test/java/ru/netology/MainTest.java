package ru.netology;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class MainTest {
    Player player;
    Weapon[] weaponsBox;

    @BeforeEach
    public void init(){
        player = new Player();
        weaponsBox = new Weapon[]{
                new Pistol(),
                new Bomb(),
                new Rifle(),
                new Slingshot()
        };

    }

    @Test
   public void testWeaponQuantity(){
        int expected = 4;
        int actual = player.getWeaponsQuantity();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testWeapon(){
        String expected = "бабах";
        Weapon weapon = weaponsBox[1];
        String actual = weapon.shot();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void notNullWeapons(){
        Assertions.assertNotNull(weaponsBox);
    }

    @Test
    public void testWrongWeaponNumber(){
        ArrayIndexOutOfBoundsException thrown = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                ()-> player.useWeapon(5),
                "Wrong weapon number"
        );
        System.out.println(thrown.getMessage());
    }


}
