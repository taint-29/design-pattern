package factorymethod;

public class BasicAnimalFactory implements AnimalFactory{

    int type = 0;

    @Override
    public Animal createAnimal() {
        if (type == 0){
            type++;
            return new Cat();
        }
        if (type == 1){
            type++;
            return new Dog();
        }
        if (type == 2){
            type = 0;
            return new Duck();
        }
        return null;
    }
}
