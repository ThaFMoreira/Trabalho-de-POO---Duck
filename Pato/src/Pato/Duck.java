
package pato;


public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public void swim(){
        System.out.println("Este pato nada.");
    }
    
    abstract void display();
    
    public void performQuack(){
        this.quackBehavior.quack();
    }
    
    public void performFly(){
        this.flyBehavior.fly();
        
    }
}
