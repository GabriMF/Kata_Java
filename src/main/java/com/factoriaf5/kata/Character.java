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

 // ==================== Iteration 1 ========================== \\
 // ==================== Character Stats ====================== \\
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

    public boolean characterCanHeal(){
        if(currentHealth < 1000 && isAlive == true){
            canHeal = true;
        }
        else{
            canHeal = false;
        }
        return canHeal;
    }

    public void healer(){
        if(canHeal == true){
            maxHeal();
        } 
    }

    public int maxHeal(){
        
        if(canHeal = true){
            this.currentHealth = currentHealth + heal;
        }

        if (currentHealth > 1000){
            this.currentHealth = 1000;
        }
        return currentHealth;
    }

    // ====================== Iteration 2 ======================== \\
    // ================== character Interactions ================= \\
    public Character (String characterName, int health, int level, boolean isAlive, int damage, int currentHealth, boolean canHeal, int heal){
        if(characterName == this.characterName){
            damage = 0;
        }
    }
}
