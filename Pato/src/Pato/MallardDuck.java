
package pato;


public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior= new Quack();
            
        }

    @Override
    void display() {
        System.out.println("Pato Mallard");
        this.swim();
        this.performFly();
        this.performQuack();
    }
    
    
    
    
}
