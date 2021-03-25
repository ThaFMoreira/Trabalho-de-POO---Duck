
package pato;


public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Pato de borracha");
        this.swim();
        this.performQuack();
        this.performFly();
    }
    
    
}
