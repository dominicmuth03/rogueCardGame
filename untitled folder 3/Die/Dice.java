package Die;
abstract class Dice {
    abstract public void preroll();
    abstract public int roll();
    public int rollnTimes(int n) {
        int retval = 0;
        for (int i = 0; i < n; i++) {
            retval += this.roll();
        }
        return retval;
    }
}