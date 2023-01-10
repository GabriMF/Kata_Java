package com.factoriaf5.kata;

public class Character {
    public int health = 1000;
    public int level = 1;
    public boolean isAlive = true;
    public int damage;
    public int currentHealth;
    public boolean canHeal;
    public int heal;

    public int damageMaker(){
        currentHealth = health - damage;
        if (currentHealth <= 0){
            isAlive = false;
        }
        return currentHealth;
    }

    public void healer(){
        if(currentHealth < 1000 && isAlive == true){
            canHeal = true;
        }

        if(canHeal = true){
            this.currentHealth = currentHealth + heal;
        }

        if (currentHealth > 1000){
            this.currentHealth = 1000;
        }
    }
}
