package prototype;

public class Animal implements Cloneable{
    private String name;
    private int age;

    @Override
    protected Animal clone()  {
        Animal animal = new Animal();
        cloneProperties(animal);
        return animal;
    }

    protected void cloneProperties(Animal animal){
        animal.setAge(age);
        animal.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
