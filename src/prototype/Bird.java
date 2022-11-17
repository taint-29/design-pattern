package prototype;

public class Bird extends Animal{
    private int flyTime;

    @Override
    protected Bird clone() {
        Bird bird = new Bird();
        bird.setFlyTime(flyTime);
        cloneProperties(bird);
        return bird;
    }

    public void setFlyTime(int flyTime) {
        this.flyTime = flyTime;
    }


}
