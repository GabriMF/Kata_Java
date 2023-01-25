package com.factoriaf5.kata;

public class Character {
    public String characterName;
    public int health = 1000;
    public int level = 1;
    public boolean isAlive;
    public int damage;
    public int currentHealth;
    public boolean canHeal;
    public int heal;

 // ================================================ \\
    public void health(){
        if(currentHealth <= 1){
            isAlive = true;
        }
        else{
            isAlive = false;
        }
    }

    public int damageMaker(){
        currentHealth = health - damage;
        if (currentHealth <= 0){
            isAlive = false;
        }
        return currentHealth;
    }

    public void characterCanHeal(){
        if(currentHealth < 1000 && isAlive == true){
            canHeal = true;
        }
        else{
            canHeal = false;
        }
        if(canHeal == true){
            healer();
        }
    }

    public void healer(){
        // if(currentHealth < 1000 && isAlive == true){
        //     canHeal = true;
        // }

        // if(isAlive == false){
        //     canHeal = false;
        // }

        if(canHeal = true){
            this.currentHealth = currentHealth + heal;
        }

        if (currentHealth > 1000){
            this.currentHealth = 1000;
        }
    }
}
