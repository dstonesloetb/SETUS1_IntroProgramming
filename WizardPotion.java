public class WizardPotion {
    public static void main(String[] args) {
        // A precise decimal value (8 bytes of memory)
        double magicPotionPotency = 99.99; 
        
        // Narrowing Casting: Manually chopping off the decimal using (int)
        int healthRestored = (int) magicPotionPotency; 
        
        System.out.println("Potion Potency: " + magicPotionPotency); // Output: 99.99
        System.out.println("Actual Health Gained: " + healthRestored); // Output: 99
    }
}
