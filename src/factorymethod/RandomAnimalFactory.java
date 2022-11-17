package factorymethod;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {

        Random random = new Random();
        int type = random.nextInt((2-0)+1);
        if (type == 0){
            return new Cat();
        }
        if (type == 1){
            return new Dog();
        }
        if (type == 2){
            return new Duck();
        }
        return null;
    }
}
