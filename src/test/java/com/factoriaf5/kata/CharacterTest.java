package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void damageTest() {
        //given
        Character character = new Character();
        //When
        character.damage = 999;
        //Then
        int result = character.damageMaker();
        assertEquals(1, result);
    }
}
