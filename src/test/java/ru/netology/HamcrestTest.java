package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HamcrestTest {
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
        assertThat(expected,equalTo(actual));
    }

    @Test
    public void testWeapon(){
        String expected = "бабах";
        Weapon weapon = weaponsBox[1];
        String actual = weapon.shot();
        assertThat(expected,equalTo(actual));
    }

    @Test
    public void notNullWeapons(){
        assertThat(weaponsBox,notNullValue());
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

    @Test
    public void testWeaponsProperties(){
        for (int i = 0; i < weaponsBox.length; i++){
            Weapon weapon = weaponsBox[i];
            assertThat(weapon.shot(),anyOf(containsString("пау пау"),containsString("пиу пиу"),
                    containsString("бабах"),containsString("вжжух")));
        }
    }

    @Test
    public void testWeaponsRightQuantity(){
        assertThat(weaponsBox,arrayWithSize(4));
    }

}
