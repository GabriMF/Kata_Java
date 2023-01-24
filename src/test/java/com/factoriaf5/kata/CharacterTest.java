package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    @Test
    public void initialHealthTest(){
    Character character  = new Character();
    int healthTest = character.health;
    assertEquals(1000, healthTest);
    }

    @Test
    public void initialLevelTest(){
    Character character  = new Character();
    int levelTest = character.level;
    assertEquals(1, levelTest);
    }

    @Test
    public void isAliveTest(){
    Character character  = new Character();
    boolean aliveTest = character.isAlive;
    assertEquals(true, aliveTest);
    }

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

    @Test
    public void isDeadTest() {
        //given
        Character character = new Character();
        //When
        character.currentHealth = 0 ;
        //Then
        boolean isItAlive = character.isAlive;
        assertEquals(false, isItAlive);
    }

    @Test
    public void canHealTest(){
        //given
        Character character = new Character();
        //when
        character.currentHealth = 50;
        //then
        boolean canHealTest = character.canHeal;
        assertEquals(true, canHealTest);
    }
}
