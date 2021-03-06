package Part2;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack(){
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    public static void setNumberOfQuacks(int numberOfQuacks) {
        QuackCounter.numberOfQuacks = numberOfQuacks;
    }
}
