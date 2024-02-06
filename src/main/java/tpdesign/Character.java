package tpdesign;

import java.util.Random;

public class Character {
    private State currentState;
    private Random random = new Random();

    public Character() {
        this.currentState = new NormalState();
        System.out.println("Character created in the normal state");
    }
    public void setNormalState() {
        this.currentState = new NormalState();
        System.out.println("The character is now in normal state");
    }
    public void setEnragedState() {
        this.currentState = new EnragedState();
        System.out.println("The character is now enraged");
    }
    public void setPoisonedState() {
        this.currentState = new PoisonedState();
        System.out.println("The character is now poisoned");
    }

    public void healCharacter() {
        if (currentState instanceof NormalState) {
            System.out.println("The character is healed and remains in normal state");
        } else {
            System.out.println("Healing has no effect, the character remains in his current state");
        }
    }

    public void enrageCharacter() {
        if (currentState instanceof NormalState) {
            this.currentState = new EnragedState();
            System.out.println("The character is now enraged");
        } else {
            System.out.println("Enrage has no effect, the character remains in his current state");
        }
    }

    public void poisonCharacter() {
        this.currentState = new PoisonedState();
        System.out.println("The character is now poisoned");
    }

    public void attackCharacter(Character target) {
        int randomValue = random.nextInt(100);

        if (randomValue < 30) {
            this.enrageCharacter();
        } else if (randomValue < 60) {
            target.enrageCharacter();
        }

        System.out.println("Attack successful, no change of state.");
    }

    public void attack() {
        currentState.attack();
    }

    public void move() {
        currentState.move();
    }
}
