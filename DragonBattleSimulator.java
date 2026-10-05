package com.mycompany.intro.exercises;

public class DragonBattleSimulator {

    
    public static void main(String[] args) {
        
        //Initial Game information 
        int attackRoll = 18;
        int armorClass = 15;
        int heroHealth = -5;
        int noiseLevel = 3;
        
        //Battle simulator 
        boolean isCriticalHit = attackRoll > armorClass; // true (18 > 15)
        boolean isHeroDefeated = heroHealth <= 0;        // true (-5 <= 0)
        boolean isDragonAwake = noiseLevel != 0;         // true (3 != 0)

        //Output results
        System.out.println("Dragon Battle Simulator");
        System.out.println("-----------------------");
        System.out.println("Is critical hit: "+isCriticalHit);
        System.out.println("Is hero defeated: "+isHeroDefeated);
        System.out.println("Is dragon awake: "+isDragonAwake);
        
        
    } //end main 
    
} //end class 
