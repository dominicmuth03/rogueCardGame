package Die;
import java.util.Random;

public class DiceSet {
    public static int d4() {
        Random rand = new Random();
        return rand.nextInt(5);
    }
    public static int d4(int n) {
        int retval = 0;
        for (int i = 0; i < n; i++) {
            retval += d4();
        }
        return retval;
    }

    public static int d6() {
        Random rand = new Random();
        return rand.nextInt(7);
    }
    public static int d6(int n) {
        int retval = 0;
        for (int i = 0; i < n; i++) {
            retval += d6();
        }
        return retval;
    }

    public static int d8() {
        Random rand = new Random();
        return rand.nextInt(9);
    }
    public static int d8(int n) {
        int retval = 0;
        for (int i = 0; i < n; i++) {
            retval += d8();
        }
        return retval;
    }

    public static int d10() {
        Random rand = new Random();
        return rand.nextInt(5);
    }
    public static int d10(int n) {
        int retval = 0;
        for (int i = 0; i < n; i++) {
            retval += d10();
        }
        return retval;
    }

    public static int d12() {
        Random rand = new Random();
        return rand.nextInt(13);
    }
    public int d12(int n) {
        int retval = 0;
        for (int i = 0; i < n; i++) {
            retval += d12();
        }
        return retval;
    }

    public static int d20() {
        Random rand = new Random();
        return rand.nextInt(21);
    }
    public int d20(int n) {
        int retval = 0;
        for (int i = 0; i < n; i++) {
            retval += d20();
        }
        return retval;
    }
}