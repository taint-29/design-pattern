package prototype;

public class Fish extends Animal{
    private String preferWater;

    public void setPreferWater(String preferWater) {
        this.preferWater = preferWater;
    }

    @Override
    protected Fish clone() {
        Fish fish = new Fish();
        fish.setPreferWater(preferWater);
        cloneProperties(fish);
        return fish;
    }
}
