package tpdesign;

public class NormalState implements State{
    public void attack() {
        System.out.println("Normal attack");
    }

    @Override
    public void move() {
        System.out.println("Normal displacement");
    }
}
