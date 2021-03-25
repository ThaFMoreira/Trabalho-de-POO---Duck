
package pato;

public class RedHeadDuck extends Duck{
    
    public RedHeadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("Pato da cabeça vermelha");
        this.swim();
        this.performFly();
        this.performQuack();
    }


}
