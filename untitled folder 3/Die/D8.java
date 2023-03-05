package Die;
import java.util.Random;
public class D8 extends Dice {
    @Override
    public void preroll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int roll() {
        preroll();
        Random rand = new Random();
        return rand.nextInt(9);
    }
}
