
package pato;


public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Pato mudo!");
    }
    
}
