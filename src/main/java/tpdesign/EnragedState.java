package tpdesign;

public class EnragedState implements  State{
    @Override
    public void attack() {
        System.out.println("Enraged Attack");
    }

    @Override
    public void move() {
        System.out.println("Fast Move");
    }
}
