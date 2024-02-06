package tpdesign;

public class PoisonedState implements State{
    @Override
    public void attack() {
        System.out.println("Attack weakened");
    }

    @Override
    public void move() {
        System.out.println("Slowed movement");
    }
}
