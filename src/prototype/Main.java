package prototype;

public class Main {
    /**
     * Tạo ra 1 đối tượng y hiện đối tượng mẫu
     * Quy định kiểu của đối tượng được tạo ra
     */

    public static void main(String[] args) {
        final Bird bird = new Bird();
        bird.setAge(1);
        bird.setName("bird");
        bird.setFlyTime(10);
        System.out.println("Bird: " + bird.toString());
        final Animal cloneBird = bird.clone();
        System.out.println("Clone bird: " + cloneBird.toString());

        final Fish fish = new Fish();
        fish.setAge(3);
        fish.setName("fish");
        fish.setPreferWater("sea");
        System.out.println("Fish: " + fish);
        final Animal cloneFish = fish.clone();
        cloneFish.toString();
        System.out.println("Clone fish: " + cloneFish);
    }
}
